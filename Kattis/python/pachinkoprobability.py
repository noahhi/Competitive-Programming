n = int(input())
m = int(input())

# store children of each node
graph = {}
# store parents of each node
parents = {}
# set of nodes which are gates
gates = set()

for _ in range(m):
    edge = input().split()
    s = int(edge[0])
    e = int(edge[1])

    if s in graph:
        graph[s].append(e)
    else:
        graph[s] = [e]

    if e in parents:
        parents[e].append(s)
    else:
        parents[e] = [s]

k = int(input())
for _ in range(k):
    gate = int(input())
    gates.add(gate)

gate_path_count = 0
total_path_count = 0

def compute_path_counts(node, path_counts):
    # check if this value already been computed
    if node in path_counts:
        return path_counts[node]

    # check if node has parents or is a start node
    if node in parents:
        total = 0
        node_parents = parents[node]
        for parent in node_parents:
            total += compute_path_counts(parent, path_counts)
        path_counts[node] = total
        return total
    else:
        # start nodes have only 1 path
        return 1
    

# save number of paths to a node
path_counts = {}
# calculate path count for every node
for node in range(n):
    path_count = compute_path_counts(node, path_counts)
    # check if node is an end node
    if node not in graph:
        if node in gates:
            gate_path_count += path_count
        total_path_count += path_count

print("winning paths " + str(gate_path_count))
print("total paths " + str(total_path_count))
