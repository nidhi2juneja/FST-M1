#1st way
# my_list = []
# sum = 0
# for i in range(6):
#     val = int(input("Enter the " + str(i) + " element of the list: "))
#     my_list.insert(i, val)

# print(my_list)
# for j in my_list:
#     sum += j
# print("Sum of all the elements of the list",sum)

#2nd way
number_list = list(input("Enter a list of comma seperated values: ").split(','))
sum = 0
for i in number_list:
    sum += int(i)
print(sum)

