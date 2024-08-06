<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h1>Calculator</h1>  
    <form action="calculate">
        <input type="number" name="num1" placeholder="Enter number 1" required>
        <br><br>
        <input type="number" name="num2" placeholder="Enter number 2" required>
        <br><br>
        <input type="submit" name="add" value="Add">
        <input type="submit" name="subtract" value="Subtract">
        <br><br>
        <input type="submit" name="multiple" value="Multiple">
        <input type="submit" name="division" value="Division">      
    </form>
</body>
</html>
