# 🤖 Gemini Chatbot - Android Application

[![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpack-compose&logoColor=white)](https://developer.android.com/jetpack/compose)
[![Google AI](https://img.shields.io/badge/Google%20AI-4285F4?style=for-the-badge&logo=google&logoColor=white)](https://ai.google.dev/)

Modern Android chatbot application powered by Google's Gemini AI, built with Jetpack Compose and following clean architecture principles.

## 🎯 Features

- **AI-Powered Conversations**: Integrated with Google's Gemini Pro model
- **Modern UI**: Built with Jetpack Compose for smooth, responsive interface
- **Material Design 3**: Following latest design guidelines with dynamic theming
- **Dependency Injection**: Hilt for efficient dependency management
- **Safety Controls**: Built-in content safety and filtering
- **Dark/Light Theme**: Automatic theme switching based on system preferences
- **Edge-to-Edge Design**: Modern full-screen experience


### Tech Stack
- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Dependency Injection**: Hilt
- **AI Integration**: Google Generative AI SDK
- **Build System**: Gradle with Kotlin DSL

### Project Structure
```
app/
├── src/main/
│   ├── java/com/eosdev/geminichatbot/
│   │   ├── di/           # Dependency injection modules
│   │   │   └── GeminiModule.kt
│   │   └── ui/           # UI components and screens
│   │       ├── MainActivity.kt
│   │       └── theme/    # Theme definitions
│   │           ├── Color.kt
│   │           ├── Theme.kt
│   │           └── Type.kt
│   └── res/              # Android resources
│       ├── values/
│       └── ...
└── build.gradle.kts      # App-level build configuration
```

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog (2023.1.1) or later
- JDK 17 or later
- Android SDK 34
- Google AI Studio API Key

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/mertncu/GeminiChatbot.git
   cd GeminiChatbot
   ```

2. **Set up API Key**
   - Visit [Google AI Studio](https://makersuite.google.com/app/apikey)
   - Create a new API key for Gemini
   - Add your API key to the build configuration:
     ```kotlin
     // In app/build.gradle.kts
     android {
         defaultConfig {
             buildConfigField("String", "API_KEY", "\"YOUR_API_KEY_HERE\"")
         }
     }
     ```

3. **Build and Run**
   ```bash
   ./gradlew assembleDebug
   ```
   Or use Android Studio's Run button

### Configuration

The app uses several configuration options in `GeminiModule.kt`:

```kotlin
private val config = generationConfig {
    temperature = 0.55f      // Creativity level (0.0-1.0)
    topK = 40               // Token selection diversity
    topP = 0.95f           // Nucleus sampling
    maxOutputTokens = 8192  // Maximum response length
    responseMimeType = "application/json"
}
```

## 📱 App Configuration

### Minimum Requirements
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)
- **Compile SDK**: 34

### Permissions
- `INTERNET` - Required for API communication with Gemini

### Safety Settings
The app implements comprehensive safety controls:
- **Hate Speech**: Blocked (NONE threshold)
- **Sexual Content**: High threshold blocking
- **Dangerous Content**: Low threshold blocking


### Components
- Modern Material 3 components
- Edge-to-edge display support
- Responsive layout design
- Accessibility-first approach

## 🔧 Development

### Build Variants
- **Debug**: Development build with debugging tools
- **Release**: Optimized production build with ProGuard/R8

### Dependencies
Key dependencies managed through `libs.versions.toml`:
- **Compose BOM**: `2024.10.00`
- **Hilt**: `2.52`
- **Generative AI**: `0.9.0`
- **Lifecycle**: `2.8.6`

## 📚 Documentation

### API Integration
The app integrates with Google's Gemini Pro model:
- **Model**: `gemini-pro`
- **Context Length**: 8192 tokens
- **Response Format**: JSON
- **Safety**: Multi-layer content filtering

### State Management
- Lifecycle-aware components
- Compose state management
- Hilt dependency injection

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 🔗 Links

- [Android Uygulamalarında Google Gemini Entegrasyonu - Medium](https://medium.com/@mertncu/android-uygulamalar%C4%B1nda-google-gemini-entegrasyonu-ve-kullan%C4%B1m%C4%B1-c0b7b7a1f339)
- [Google AI Studio](https://makersuite.google.com/)
- [Jetpack Compose Documentation](https://developer.android.com/jetpack/compose)
- [Hilt Documentation](https://dagger.dev/hilt/)
- [Material Design 3](https://m3.material.io/)
