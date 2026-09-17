# ProgPartOne
This is a Java application designed to handle user registration, credential validation, and authentication. The project evaluates user details such as full name, username formatting, password complexity, and international cellphone number standards before enabling secure login validation.

Features includes:
Username Validation: Ensures the username contains an underscore (_) and does not exceed 5 characters in length.

Password Complexity Checking: Validates that passwords contain:

At least 8 characters

At least 1 uppercase letter (A-Z)

At least 1 numeric digit (0-9)

At least 1 special character

International Cellphone Number Check: Verifies that the phone number begins with the South African international code (+27) and consists of exactly 12 characters.

User Authentication: Compares login attempts against registered credentials and outputs real-time login feedback.

