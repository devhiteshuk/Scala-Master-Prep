# Scala-Master-Prep
Scala-Master-Prep
Scala flatMap Function
The flatMap function is a combination of map and flatten. It applies a function to each element in a collection, which itself returns a collection, and then flattens the result into a single list.

Why Use flatMap?
✅ Removes Nested Structures: Flattens lists of lists into a single list.
✅ Useful for Data Transformation: Helps break down complex data.
✅ Common in Spark: Used in distributed data processing (RDD transformations).



Scala union Function
The union function in Scala is used to combine two collections, including duplicates. It merges the elements of both collections while keeping all values.

Why Use union?
✅ Combines Data from Multiple Sources
✅ Preserves Duplicates (Unlike distinct)
✅ Useful in Big Data Processing (Spark RDDs, DataFrames)

Use Case: Merging Customer Lists from Two Databases
Scenario
A company maintains customer data in two separate databases:

Existing customers
New customers (potential duplicates)
Your task is to combine both customer lists.
