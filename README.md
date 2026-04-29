# 🚀 CI/CD Pipeline with Spring Boot, Docker & Kubernetes

## 📌 Overview

This project demonstrates a complete end-to-end CI/CD pipeline:

- Build a backend application (Spring Boot)
- Containerize using Docker
- Automate build using GitHub Actions (CI)
- Push Docker image to Docker Hub
- Deploy and run on Kubernetes (Minikube)

---

## 🧠 Architecture

Spring Boot App
      ↓
Docker Image
      ↓
GitHub Actions (CI/CD)
      ↓
Docker Hub (Image Registry)
      ↓
Kubernetes (Minikube)
      ↓
Running Application (Service)

---

## ⚙️ Technologies Used

- Java (Spring Boot)
- Docker
- GitHub Actions
- Docker Hub
- Kubernetes (Minikube)
- kubectl

---

## 🧩 Step-by-Step Pipeline

### 1️⃣ Backend Application
- Created a Spring Boot application
- Exposed endpoint: GET /health

### 2️⃣ Dockerization
Dockerfile:
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "app.jar"]

Commands:
mvn clean package
docker build -t myapp .
docker run -p 9091:9090 myapp

### 3️⃣ CI Pipeline (GitHub Actions)
- Checkout code
- Setup Java
- Build JAR
- Build Docker image

### 4️⃣ Push Image to Docker Hub
- Login using secrets
- Tag image
- Push image

### 5️⃣ Kubernetes Deployment
deployment.yaml and service.yaml used

### 6️⃣ Deploy
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml

### 7️⃣ Verify
kubectl get pods
kubectl get services

### 8️⃣ Access
minikube service myapp-service
Then open /health

---

## 📁 Project Structure

.
├── src/
├── Dockerfile
├── pom.xml
├── .github/workflows/ci.yml
├── k8s/
│   ├── deployment.yaml
│   ├── service.yaml

---

## 🏆 Outcome

Complete CI/CD pipeline with Docker + Kubernetes deployment.
