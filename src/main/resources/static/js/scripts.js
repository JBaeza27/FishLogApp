document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('fishForm');

    form.addEventListener('submit', async (event) => {
        event.preventDefault(); // Stops from going to different page url

        // Inputting element by identification
        const fishSpecies = document.getElementById('fishSpecies').value;
        const fishWeight = document.getElementById('fishWeight').value;
        const fishLength = document.getElementById('fishLength').value;

        try {
            // Fetch API to get the input from user and send it to the mySQL database
            const response = await fetch('/api/fish/add', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/x-www-form-urlencoded',
                },
                body: new URLSearchParams({
                    fishSpecies,
                    fishWeight,
                    fishLength
                }).toString()
            });
            //Response to see if submission was successful or not
            const result = await response.text();
            console.log('Success:', result);
            alert('Fish data submitted successfully!');
        } catch (error) {
            console.error('Submission error:', error);
            alert('Error submitting fish data.');
        }
    });
});