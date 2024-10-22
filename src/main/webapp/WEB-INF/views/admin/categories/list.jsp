<%@ taglib prefix="cd" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<table>
    <thead>
        <th>STT</th>
        <th>Images</th>
        <th>Category Name</th>
        <th>Status</th>
        <th>Action</th>
    </thead>

    <tbody>
        <c:forEach items="${categories}" var="cate" varStatus="STT">
            <tr>
                <td>${STT.index + 1}</td>
                <td>${cate.image}</td>
                <td>${cate.name}</td>
                <td>${cate.status}</td>
                <td>
                    <a href="/admin/categories/edit/${cate.id}">Edit</a>
                    <a href="/admin/categories/delete/${cate.id}">Delete</a>
                </td>

            </tr>
        </c:forEach>

    </tbody>
</table>