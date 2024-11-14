package com.eosdev.geminichatbot.di

import com.google.ai.client.generativeai.BuildConfig
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.BlockThreshold
import com.google.ai.client.generativeai.type.GenerationConfig
import com.google.ai.client.generativeai.type.HarmCategory
import com.google.ai.client.generativeai.type.SafetySetting
import com.google.ai.client.generativeai.type.generationConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object GeminiModule {
    private val sexualExplicit = SafetySetting(HarmCategory.SEXUALLY_EXPLICIT, BlockThreshold.ONLY_HIGH)
    private val hateSpeech = SafetySetting(HarmCategory.HATE_SPEECH, BlockThreshold.NONE)
    private val dangerousContent = SafetySetting(HarmCategory.DANGEROUS_CONTENT, BlockThreshold.LOW_AND_ABOVE)

    private val config = generationConfig {
        temperature = 0.55f
        topK = 40
        topP = 0.95f
        maxOutputTokens = 8192
        responseMimeType = "application/json"
    }

    @Provides
    @Singleton
    fun getGeminiModel(): GenerativeModel {
        return GenerativeModel(
            modelName = "gemini-pro",
            apiKey = BuildConfig.API_KEY,
            safetySettings = listOf(
                hateSpeech, sexualExplicit, dangerousContent
            ),
            generationConfig = config
        )
    }
}