from pip._vendor.distlib.compat import raw_input

def main():       
    
    infile = input("Please enter the filename to open: ")
    infile = open(infile, "r")
    news = ""
    line = infile.readline()
    line = line.strip()
    line = line.replace("  ", ",")
    for i in range(len(line)):
        if line[i] != ("  "):
            news = news + line[i]
        else:
            news = news + ","
    list1 = []
    news = news.split(",")
    for item in news:
        x = int(item)
        list1.append(x)
        
    MaxArray(list1)
    
def MaxArray(values):
    
    maxSoFar = 0            # largest positive value the sequence has attained
    count = 0               # current value that the subsequence has
    largestIndex = 0        # index where the largest positive value occurred
    index = 0               # current index 
    first = index           # first index of the current subsequence
    list1 = []              # list to hold positive subsequences 
    list2 = (findMVCS(values, index, count, maxSoFar, largestIndex, first, list1)) # O(n)

    newValues = []          # new list to hold subsequence values

    for item in list2:                                                           
        newValues.append(item[1])  # append the subsequence values to the new list
    
    y = max(newValues)             # choose the highest value                                      

    for item in list2:             #                                                
        if item[1] == y:
            indexes = (item[0])
            
    start = indexes[0]
    end = indexes[1]
    mvcs = []
    for i in range(start, end+1):                                                   # O(n)
        j = values[i]
        mvcs.append(j)  
    print("The MVCS of the sequence is : " + str(mvcs))
    print()
    print("Press any key to exit...")
    raw_input()  
    
def findMVCS(values, index, count, maxSoFar, largestIndex, first, list1):
        
        value = values[index]
        count = value + count

        if count > maxSoFar:
            maxSoFar = count
            largestIndex = index
            
            if index == len(values)-1:                      
                list2 = [(first, largestIndex), maxSoFar] 
                list1.append(list2)
                
            else:
                list1 = findMVCS(values, index+1, count, maxSoFar,largestIndex, first, list1)
        else:
            if index == len(values)-1:
                list2 = [(first, largestIndex), maxSoFar] 
                list1.append(list2)

            else:
                if count <= 0:
                    list2 = [(first, largestIndex), maxSoFar] 
                    list1.append(list2)
                    count = 0
                    maxSoFar = 0
                    first = index+1
                    
                list1 = findMVCS(values, index+1, count, maxSoFar, largestIndex, first, list1)
        
        return list1

main()    