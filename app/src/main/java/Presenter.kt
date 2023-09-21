import com.example.homeworksavestatewithmvp.View

interface Presenter {
    fun addNumberOfClicks()
    fun setView(view: View)
}