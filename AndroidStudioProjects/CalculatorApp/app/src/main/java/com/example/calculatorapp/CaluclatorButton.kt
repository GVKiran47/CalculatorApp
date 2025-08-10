package com.example.calculatorapp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun CalculatorButton(
    label: String, // The text to display on the button [2]
    modifier: Modifier = Modifier, // Modifier for custom styling [2]
    onClick: () -> Unit // Lambda function to be executed when the button is clicked [2]
) {
    Button(
        onClick = onClick, // Sets the click listener [2]
        modifier = modifier, // Applies the provided modifier [2]
        shape = RoundedCornerShape(12.dp), // Sets rounded corners for the button [2]
        colors = ButtonDefaults.buttonColors( // Defines button colors based on the label [2]
            containerColor = if (label in listOf("+", "-", "*", "/", "=")) Color(0xFF1976D2) else Color(0xFFE0E0E0), // Blue for operators/equals, light grey for numbers [2]
            contentColor = if (label in listOf("+", "-", "*", "/", "=")) Color.White else Color.Black // White text for operators/equals, black for numbers [2]
        )
    ) {
        Text(text = label, fontSize = 24.sp) // Displays the button label with a specific font size [2]
    }
}
