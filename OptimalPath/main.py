"""
FIrst iteration path solver for Eulers problem no 18
    
    Problem:: Given a pyramidal array of numbers find the path that gives the greatest total
    
    Observations:Path is binary can apply something like decision tree with weighted probabilities given as 50%
    
    Methodology: 
        Algorithm:
                Trace back all descendants back to parent
                Node value = (.5 * descendant + parent)
        Programming:
                Base recursive for smallest unit of 3 numbers
                Work up until  number is met
"""
#Globals
"""
    Data import is in form listoflist
    Algorithm will manipulate by checking first index and then second index
"""
#import data from file
file = open('triangle.txt','r')
#create lists
listoflists =[]
#fill list
#read line by line
for line in file:
    rowlist =[]#split and read number by number
    for number in line.split(" "):
        try:
            rowlist.append(int(number))
        except:
            pass
    listoflists.append(rowlist)

print(listoflists)
#Algorithm
# build node values
def smallest_node_weighted_value(pyramid_as_list, node_position):
    #node position is vector with 2 values
    node_value = pyramid_as_list[node_position[0]][node_position[1]]
    child_values= max(pyramid_as_list[node_position[0]+1][node_position[1]],pyramid_as_list[node_position[0]+1][node_position[1] + 1])
    total_node_value = node_value + child_values
    
    return total_node_value

#build node values for top level nodes, returns node value
def node_weighted_value(pyramid_as_list,node_position):
    #start from bottom and build up to top
    new_pyramid = list(pyramid_as_list)
    level = len(pyramid_as_list)-2
    #find the number of levels between current position
    while level >= node_position[0]:
        weighted_node_list =[]
        #left justified file import therefore numbers only expanding to the right 1 per level with constant 1
        for x_of_node in range(node_position[1],node_position[1]+level+1):
            weighted_node_list.append(smallest_node_weighted_value(new_pyramid,[level, x_of_node]))
        #delete old pyramid values and put new ones in      
        new_pyramid[level] =[]
        new_pyramid[level] = weighted_node_list
        #decrement current level                  
        level -= 1
    
    print(new_pyramid)
    
    return new_pyramid

def choose_path(pyramid_as_list, node_position):
    weighted_pyramid = node_weighted_value(pyramid_as_list,node_position)
    path = [node_position]
    #choose location of path by looking up last path position
    while path[-1][0] < len(weighted_pyramid)-1:
            current_position = path[-1]
            #define range for choices
            new_row = current_position[0]+1
            #cant use index must be from current position
            new_x = current_position[1]+simplest_path(weighted_pyramid[new_row][current_position[1]],weighted_pyramid[new_row][current_position[1]+1])
            path.append([new_row,new_x])
            
    return path
#function returns number and left[0] or right[1]
def simplest_path(leftnumber, rightnumber):
    if leftnumber > rightnumber:
        return 0
    else:
        return 1
#walk path
def walk_path(path,pyramid_as_list):
    total = 0
    for node in path:
        value = pyramid_as_list[node[0]][node[1]]
        total += value
        print(total)
    return total, path
            
#run
#print(node_weighted_value(listoflists,[0,0]))
print(walk_path(choose_path(listoflists,[0,0]),listoflists))