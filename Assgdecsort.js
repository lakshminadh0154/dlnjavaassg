function sortArrayDesc(arr) {
    return arr.sort(function(a, b) {
        return b - a; // Compare elements in descending order
    });
}

// Get user input as a comma-separated string and split it into an array
const prompt = require("prompt-sync")({sigint:true});
const userInput = prompt("Enter a comma-separated list of numbers:");

if (userInput) {
    const inputArray = userInput.split(',').map(Number);

    // Check if the input is valid
    if (!inputArray.some(isNaN)) {
        const sortedArray = sortArrayDesc(inputArray);
        console.log("Sorted Array in Descending Order: " + sortedArray);
    } else {
        console.log("Invalid input. Please enter a comma-separated list of numbers.");
    }
} else {
    console.log("No input provided.");
}
