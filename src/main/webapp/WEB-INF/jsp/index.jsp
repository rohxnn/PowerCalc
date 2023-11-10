<%@ page contentType="text/html; charset=UTF-8" language="java" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>PowerCalc</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../static/css/styles.css">
    <script src="../../static/scripts/scripts.js"></script>
</head>
<body>
    <header>
        <h1 id="heading">PowerCalc</h1>
       
      </header>
<div class="container mt-4">
    <div class="card">
        <div class="card-header">
            <h5 class="card-title">PowerCalc</h5>
        </div>
        <div class="card-body">
            <form action="/value" method="post">
                <div class="form-group">
                    <label for="tariffSelect"><b>Tariff</b></label>
                    <select id="tariffSelect" class="form-control" onchange="updatePurpose()" name="tarif" required>
                        <option value="">Select an option</option>
                        <option value="LT-1A">LT-1A</option>
                        <option value="LT-4A">LT-4A</option>
                        <option value="LT-4B">LT-4B</option>
                        <option value="LT-5A">LT-5A</option>
                        <option value="LT-5B">LT-5B</option>
                        <option value="LT-6A">LT-6A</option>
                        <option value="LT-6B">LT-6B</option>
                        <option value="LT-6C">LT-6C</option>
                        <option value="LT-6D">LT-6D</option>
                        <option value="LT-6E">LT-6E</option>
                        <option value="LT-6F">LT-6F</option>
                        <option value="LT-6G">LT-6G</option>
                        <option value="LT-7A">LT-7A</option>
                        <option value="LT-7B">LT-7B</option>
                        <option value="LT-7C">LT-7C</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="purposeInput"><b>Purpose</b></label>
                    <input type="text" class="form-control" id="purposeInput" placeholder="Purpose" disabled>
                </div>
                <div class="form-group">
                    <label for="powerRating"><b>Power Rating (Watt)</b></label>
                    <input type="number" step="0.1" class="form-control" id="powerRating" placeholder="Enter Power Rating" name="power" required>
                </div>
                <div class="form-group">
                    <label for="timeConsumed"><b>Time Consumed (hr)</b></label>
                    <input type="number" step="0.1" class="form-control" id="timeConsumed" placeholder="Enter Time Consumed" name="time" required>
                </div>
                <div class="form-group">
                    <label for="connectedLoad"><b>Connected Load (Watt)</b></label>
                    <input type="number" step="0.1" class="form-control" id="connectedLoad" placeholder="Enter Connected Load" name="load" disabled required>
                </div>
                  <button type="submit" class="btn  mt-4"><b>Calculate</b></button>
            </form>
        </div>
      
    </div>
    <div class="side">
    <div class="notes">
        <ul>
            <li>This calculator is intended for estimate the cost of running electrical appliances or devices based on their power consumption (in watts) and the time they are used.</li>
             <li> Actual charge may vary according to consumer status</li>  
             <li>connected Load is only for specified Tariff</li>
        </ul>
    </div>
    <c:if test="${not empty total}">  
    <div class="result">
        
        <div class="form-group">
            <label for="electricityCost"><h3>Electricity Cost:</h3>  <span id="electricityCost"><h1>₹ ${total}</h1></span></label>
            <h3 id="result-detail">${power} Watt cost you Rs. ${total } in ${time} hr.</h3>
          
        </div>
    </div>
    </c:if>
   
   </div>
</div>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.8/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<hr class="mt-5">

<footer >
   <p> &copy; Rohan Thomas Reji</p>
    <div class="image">
        <img src="../../static/image/eb.png" alt="" width="200" height="100">
    </div>
</footer>
</body>
</html>
