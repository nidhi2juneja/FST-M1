import pandas as pd

dataframe = pd.read_csv('Sensitiveinfo.csv')
print(dataframe)

# Print the values for the Username column
print("Usernames are:")
print(dataframe["Usernames"])

#Print the username and password of the second row
print("Username is: ", dataframe["Usernames"][1], "and Password is: ", dataframe["Passwords"][1] )

# Sort the usernames column in ascending order
print("Usernames sorted in ascending order")
print(dataframe.sort_values("Usernames"))

# Sort the Passwords column in descending order
print("Passwords sorted in descending order")
print(dataframe.sort_values("Passwords", ascending=False))