function reversesent(sentence) {
    // Split the sentence into words using spaces as the delimiter
    const words = sentence.split(" ");

    // Reverse each word and store the result in an array
    const reversedWords = words.map(word => {
        // Use the split-reverse-join method to reverse each word
        return word.split('').reverse().join('');
    });

    // Join the reversed words to form the reversed sentence
    const reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

// Get user input
const prompt = require("prompt-sync")({sigint:true});
const userInput = prompt("Enter a sentence:"); // Prompt for user input

// Call the function to reverse the words in the sentence
const reversedResult = reversesent(userInput);

// Display the reversed sentence
console.log("Reversed Sentence: " + reversedResult);
