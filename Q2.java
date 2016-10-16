public class Q2 extends AppCompatActivity {
    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        TextView totalScoreTextView = ((TextView)findViewById(R.id.total_score));
        totalScoreTextView.setText(totalScoreTextView.getText() + " " +((FlagQuiz)getApplicationContext()).totalScore);
    }

    public void checkanswer(View v) {
        EditText et2 = (EditText) findViewById(R.id.et2);
        if (et2.getText().toString().trim().toLowerCase().equals("srilanka")) {
            Toast toast = Toast.makeText(Q2.this, "Correct answer +5", Toast.LENGTH_SHORT);
            toast.getView().setBackgroundColor(Color.GREEN);
            toast.show();
            ((FlagQuiz)getApplicationContext()).totalScore += 5;
        } else {
            Toast toast = Toast.makeText(Q2.this, "Incorrect answer O points", Toast.LENGTH_SHORT);
            toast.getView().setBackgroundColor(Color.RED);
            toast.show();
        }
        startActivity(new Intent(Q2.this, Q3.class));
        this.finish();
    }
}
