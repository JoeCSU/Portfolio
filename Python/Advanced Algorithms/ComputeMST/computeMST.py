# Computes the Minimum Spanning tree for the given graph  

from pip._vendor.distlib.compat import raw_input
  

def main():
    numVerts = 8                            # set the number of vertices in the graph
    graph  = [[],[],[],[],[],[],[],[]]
    for i in range(0, numVerts):
        graph[i].append(float("inf"))       # generate an empty matrix    
        for j in range(0, numVerts-1):
            graph[i].append(float("inf"))
       
    addEdge(graph, 0, 4, 4)                 # call addEdge for each vertex, weight
    addEdge(graph, 0, 1, 5)
    addEdge(graph, 1, 2, 6)
    addEdge(graph, 1, 5, 14)
    addEdge(graph, 1, 6, 10)
    addEdge(graph, 1, 4, 3)
    addEdge(graph, 2, 6, 9)
    addEdge(graph, 2, 7, 17)
    addEdge(graph, 2, 3, 1)
    addEdge(graph, 3, 7, 12)
    addEdge(graph, 4, 5, 11)
    addEdge(graph, 5, 6, 7)
    addEdge(graph, 6, 7, 15)
    printMST(graph)                         # call printMST


def addEdge(graph, i, j, value):            # takes a vertex(i,j) and weight and sets the matrix indices  
    graph[i][j] = value                     # to the weight value, thus generating a weighted adjacency list 
    graph[j][i] = value
   
def printMST(graph):
                                            # prints the MSt of the graph
    visited = []
    q = [0]
    MST = []
    edges = [0]                             # initialize some lists to hold stuff for the logic
    seen = []                               #    
    root = 0
    prevRoot = 0
    
    while q != []:

        prevRoot = root
        r = min(q)
        root = edges[q.index(r)]
        if root != prevRoot:
            if (graph[prevRoot][root] != float("inf" ))and (graph[prevRoot][root] <= r):
                if ((prevRoot, root) not in MST and (root, prevRoot) not in MST):
                    MST.append((prevRoot, root))

            else:
                s = (MST[len(MST)-1])             
                if ((s[0], root) not in MST and (graph[s[0]][root]) <= r):
                    MST.append((s[0], root))
           
        q.remove(r)
        edges.remove(root)

        for i in range(len(graph[root])):
            if graph[root][i] != float("inf"):
                if (graph[root][i] not in seen):
                    x = graph[root][i]
                    q.append(x)                 # appends weight of (u,v) to q
                    edges.append(i)             # appends destination vertex, v to edges
                    seen.append(x)              #
        if root not in visited:
            visited.append(root)
                    
    print("The minimum spanning tree for the graph is: ", MST)
    print()
    print("Press enter to exit...")
    raw_input()                    
main()