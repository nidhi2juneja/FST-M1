def fibonacci_seq(num):
    if num <= 1:
        return num
    else:
        return(fibonacci_seq(num-1) + fibonacci_seq(num-2))
 
numbers_to_be_generated = int(input("Enter how many Fibonnaci numbers to be generated: "))

if numbers_to_be_generated <= 0:
    print("Please enter a positive number")
else:
    for i in range(numbers_to_be_generated):
        print(fibonacci_seq(i))
