# Import pandas
import pandas as pd
from pandas import ExcelWriter

# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Suchismita", "Jeet", "Kaustav"],
	'LastName':["Roy", "Ghosh", "Roy"],
	'Email':["SuchisR@example.com", "JeetG@example.com", "kaustav.roy@example.com"],
	'PhoneNumber':["897654361", "4892184058", "4528727830"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pd.DataFrame(data)

# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

# Commit data to the Excel file
writer.save()