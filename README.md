# cloudHustler

A multi-module project for modern agricultural and marketplace solutions, featuring backend services (Java Spring Boot) and a frontend (Angular).  
This project includes modules for farm management, marketplace, chat, delivery, AI-powered features, and more.

---

## Table of Contents

- [Project Structure](#project-structure)
- [Features](#features)
- [Getting Started](#getting-started)
- [Backend Setup](#backend-setup)
- [Frontend Setup](#frontend-setup)
- [Environment Variables & Secrets](#environment-variables--secrets)
- [Contributing](#contributing)
- [License](#license)

---

## Project Structure

```
cloudHustler/
│
├── pi-dev-backend/      # Main backend (Spring Boot)
├── pi-dev-frontend/     # Main frontend (Angular)
├── boycott/             # Additional backend module
├── meddhiaalaya/        # Additional backend module
├── uploads/             # Uploaded files (images, PDFs, etc.)
└── README.md
```

---

## Features

- **Farm Management**: Manage farms, crops, and related data.
- **Marketplace**: Product listings, categories, and order management.
- **Chat**: Real-time chat between users.
- **AI Integration**: Crop disease detection and smart recommendations.
- **Delivery & Logistics**: Manage deliveries and drivers.
- **User Authentication**: OAuth2, JWT, and role-based access.
- **Backoffice Dashboard**: Admin tools and analytics.
- **Blog & Events**: Content management for blogs and events.

---

## Getting Started

### Prerequisites

- [Node.js](https://nodejs.org/) (for frontend)
- [Angular CLI](https://angular.io/cli)
- [Java 17+](https://adoptopenjdk.net/) (for backend)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com/)

---

## Backend Setup

1. **Navigate to the backend directory:**
   ```sh
   cd pi-dev-backend
   ```

2. **Install dependencies and run:**
   ```sh
   ./mvnw spring-boot:run
   ```
   Or on Windows:
   ```sh
   mvnw.cmd spring-boot:run
   ```

3. **Configuration:**
   - Edit `src/main/resources/application.properties` for your database and service credentials.
   - **Do not commit secrets!** Use environment variables or a local `.env` file (add to `.gitignore`).

---

## Frontend Setup

1. **Navigate to the frontend directory:**
   ```sh
   cd pi-dev-frontend
   ```

2. **Install dependencies:**
   ```sh
   npm install
   ```

3. **Run the Angular app:**
   ```sh
   ng serve
   ```
   The app will be available at [http://localhost:4200](http://localhost:4200).

---

## Environment Variables & Secrets

- **Never commit secrets or credentials to the repository.**
- Use `.env` files (added to `.gitignore`) or environment variables for sensitive data.
- Example for backend:
  ```
  DB_USERNAME=your_db_user
  DB_PASSWORD=your_db_password
  TWILIO_API_KEY=your_twilio_key
  ```

---

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

**Feel free to adapt this README to better fit your project’s specifics!**
