def sum(number):
    if number <= 1:
        return number
    else:
        return number + sum(number-1)

print(sum(10))