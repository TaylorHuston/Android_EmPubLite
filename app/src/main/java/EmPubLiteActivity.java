import android.app.Activity;
import android.os.Bundle;

import com.commonsware.empublite.R;

public class EmPubLiteActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
