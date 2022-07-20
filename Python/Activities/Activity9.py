num_list1 = [3,5,4,34,78,56,24,19,10]
num_list2 = [7,4,2,7,87,56,1,92,45,98]

print(num_list1)
print(num_list2)

final_list = []

for i in num_list1:
    if(i % 2 != 0):
        final_list.append(i)

for j in num_list2:
    if(j % 2 == 0):
        final_list.append(j)

print(final_list)
