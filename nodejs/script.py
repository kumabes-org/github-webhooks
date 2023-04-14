def snake_to_camel(test_str):
    temp = test_str.split('_')    
    # joining result
    res = temp[0] + ''.join(ele.title() for ele in temp[1:])        
    # printing result
    return str(res)


filename = "file.txt"

# Open the file as f.
# The function readlines() reads the file.
with open(filename) as f:
    content = f.read().splitlines()

# Show the file contents line by line.
# We added the comma to print single newlines and not double newlines.
# This is because the lines contain the newline character '\n'.
index = 0
for line in content:
    new_line = line.strip().split(":")[0].replace("\"", "")
    print(snake_to_camel(new_line))
    # if(index == 1 or index == 17):
    #     print(line.strip().split("\"")[2])
    # else:
    #     print(line.strip().split("\"")[3])
    index +=1    