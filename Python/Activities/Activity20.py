from sqlite3 import DatabaseError
import pandas as pd

dataframe = pd.read_excel("Personaldata.xlsx")
print(dataframe)

# Print the number of rows and columns
print("Number of rows and columns are" ,dataframe.shape)

# Print the data in the emails column only
print(dataframe["Email"])

# Sort the data based on FirstName in ascending order and print the data
print(dataframe.sort_values("FirstName"))