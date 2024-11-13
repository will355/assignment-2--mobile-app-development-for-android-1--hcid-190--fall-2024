import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inputMatrixSize = findViewById<EditText>(R.id.inputMatrixSize)
        val generateMatrixButton = findViewById<Button>(R.id.generateMatrixButton)
        val matrixOutput = findViewById<TextView>(R.id.matrixOutput)


        generateMatrixButton.setOnClickListener {
            val size = inputMatrixSize.text.toString().toIntOrNull()
            if (size == null || size <= 0) {
                matrixOutput.text = "Please enter a positive integer."
                return@setOnClickListener
            }


            val matrix = generateMatrix(size)
            matrixOutput.text = "Initial Matrix with zeros:\n${formatMatrix(matrix)}\n"

            populateMatrix(matrix)
            matrixOutput.append("\nMatrix after populating with sequential values:\n${formatMatrix(matrix)}\n")

            flipMatrixAcrossDiagonal(matrix)
            matrixOutput.append("\nMatrix after flipping across the diagonal:\n${formatMatrix(matrix)}\n")
        }
    }


    private fun generateMatrix(size: Int): Array<IntArray> {
        return Array(size) { IntArray(size) { 0 } }
    }


    private fun populateMatrix(matrix: Array<IntArray>) {
        var value = 1
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                matrix[i][j] = value++
            }
        }
    }


    private fun flipMatrixAcrossDiagonal(matrix: Array<IntArray>) {
        val size = matrix.size
        for (i in 0 until size) {
            for (j in 0 until size - i - 1) {  // Elements above the diagonal
                val temp = matrix[i][j]
//                matrix[i][j] = matrix[size - j - 1][size - i - 1]
//                matrix[size - j - 1][size - i - 1] = temp

            }
        }
    }


    private fun formatMatrix(matrix: Array<IntArray>): String {
        return matrix.joinToString("\n") { row -> row.joinToString(" ") }
    }
}
