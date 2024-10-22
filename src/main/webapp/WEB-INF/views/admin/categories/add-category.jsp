<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Category</title>
</head>
<body>
<h2>Create New Category</h2>
<form action="/admin/categories/create" method="post" enctype="multipart/form-data">
    <label for="name">Category Name:</label><br>
    <input type="text" id="name" name="name" required><br><br>

    <label for="image">Category Image:</label><br>
    <input type="file" id="image" name="image" accept="image/*" required><br><br>

    <label for="status">Status:</label><br>
    <select id="status" name="status" required>
        <option value="active">Active</option>
        <option value="inactive">Inactive</option>
    </select><br><br>

    <button type="submit">Create Category</button>
</form>
</body>
</html>
