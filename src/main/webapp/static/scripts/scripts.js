function updatePurpose() {
        var tariffSelect = document.getElementById("tariffSelect");
        var purposeInput = document.getElementById("purposeInput");
        var connectedLoadInput = document.getElementById("connectedLoad");
        purposeInput.value = "";
        connectedLoad.disabled = true;

        switch (tariffSelect.value) {
            case "LT-1A":
                purposeInput.value = "Domestic";
                break;
            case "LT-4A":
                purposeInput.value = "Industry";
                connectedLoad.disabled = false;
                break;
            case "LT-4B":
                purposeInput.value = "IT enabled Service";
                connectedLoad.disabled = false; 
                break;
            case "LT-5A":
                purposeInput.value = "Pumping";
                break;  
            case "LT-5B":
                purposeInput.value = "Livestock farm";
                break; 
           
            case "LT-6A":
                purposeInput.value = "Educational Institution";
                connectedLoad.disabled = false; 
                break;
            case "LT-6B":
                purposeInput.value = "KWA offices";
                connectedLoad.disabled = false; 
                break;
            case "LT-6C":
                purposeInput.value = "Railways";
                connectedLoad.disabled = false; 
                break;
            case "LT-6D":
                purposeInput.value = "Orphanage";
                break;
            case "LT-6E":
                purposeInput.value = "Gymnasium";
                break;
            case "LT-6F":
                purposeInput.value = "Construction";
                break;
            case "LT-6G":
                purposeInput.value = "Private Hospital";
                break;
            case "LT-7A":
                purposeInput.value = "Commercial";
                break;
            case "LT-7B":
                purposeInput.value = "Shops";
                break;
            case "LT-7C":
                purposeInput.value = "Cinema Theatre";
                break;
           
        }
    }