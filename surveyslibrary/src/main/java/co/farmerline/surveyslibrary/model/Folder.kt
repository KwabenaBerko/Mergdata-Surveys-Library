package co.farmerline.surveyslibrary.model

data class Folder(
        val id: Int,
        val name: String,
        val description: String?,
        val sequence: Int,
        val folderTypeId: Int,
        val folderIconId: Int,
        val createdAt: String,
        val updatedAt: String
)