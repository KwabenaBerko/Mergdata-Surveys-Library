package co.farmerline.surveyslibrary.model

data class Survey(
        val id: String,
        val organisationId: Int,
        val sequence: Int,
        val code: String,
        val defaultLanguageId: Int,
        val surveyStatusId: Int
)