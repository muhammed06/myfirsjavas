public class MyActivity extends ActionBarActivity {
       private Button seçme;
    public static final int RESULT_CODE = 43;
    private String yol="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        final TextView textviv = (TextView) findViewById(R.id.textView);
        seçme = (Button) findViewById(R.id.button);
        textviv.setText(yol);
        seçme.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
               /*final int PICK_CONTACT_REQUEST = 1;  // istek kodu
                    Intent pickContactIntent = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts"));
                    pickContactIntent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_TYPE); // sadece telefon numarası olan kullanıcıları göstersin
                    startActivityForResult(pickContactIntent, PICK_CONTACT_REQUEST);*/

               /* Intent fileIntent = new Intent(Intent.ACTION_GET_CONTENT);
                fileIntent.setType("file/*"); // intent type to filter application based on your requirement
                startActivityForResult(fileIntent, RESULT_CODE);*/
                Intent i = new Intent(Intent.ACTION_GET_CONTENT);
                i.setType("*/*");
                startActivityForResult(i, RESULT_CODE);
            }
        });

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        // metoda gelen isteğin, yanıt vereceğimiz istek olup olmadığını kontrol edelim
        if (requestCode == RESULT_CODE ){
            Toast.makeText(getApplicationContext(),"Bu tamam",Toast.LENGTH_SHORT).show();
            Uri uri = null;
            if(resultCode == Activity.RESULT_OK)
            if (data != null) {
                uri = data.getData();
                Log.i("Dikkat", "Uri: " + uri.toString());
                Toast.makeText(getApplicationContext(),uri.toString(),Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(),"olmadı",Toast.LENGTH_SHORT).show();
        }
    }
