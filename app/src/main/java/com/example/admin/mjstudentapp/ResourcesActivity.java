package com.example.admin.mjstudentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class ResourcesActivity extends AppCompatActivity {

    Toolbar toolbar;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() == null) {
            Intent loginActivityIntent = new Intent(ResourcesActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id==R.id.item1_id){

            firebaseAuth.signOut();
            Intent loginActivityIntent = new Intent(ResourcesActivity.this, LoginActivity.class);
            startActivity(loginActivityIntent);
            finish();
        }else if(id==android.R.id.home){

            finish();

        }
        return super.onOptionsItemSelected(item);
    }

    public void browser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=samad.kamdod"));
        startActivity(browserIntent);
    }

    public void browser2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=abmohammed"));
        startActivity(browserIntent);
    }

    public void browser3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=abubakar"));
        startActivity(browserIntent);
    }

    public void browser4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=umesa.ahmed"));
        startActivity(browserIntent);
    }

    public void browser5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ashfaquejafari"));
        startActivity(browserIntent);
    }

    public void browser6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=asra.fatima"));
        startActivity(browserIntent);
    }

    public void browser7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=barkatalikhan"));
        startActivity(browserIntent);
    }

    public void browser8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=drmrao"));
        startActivity(browserIntent);
    }

    public void browser9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=gpkhan"));
        startActivity(browserIntent);
    }

    public void browser10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=husna.nooreen"));
        startActivity(browserIntent);
    }

    public void browser11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=jagmohan"));
        startActivity(browserIntent);
    }

    public void browser12(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=srilakshmi"));
        startActivity(browserIntent);
    }

    public void browser13(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=makhalique"));
        startActivity(browserIntent);
    }

    public void browser14(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=m.sridevi"));
        startActivity(browserIntent);
    }

    public void browser15(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=minhajuddin.saif"));
        startActivity(browserIntent);
    }

    public void browser16(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=moiz.khan"));
        startActivity(browserIntent);
    }

    public void browser17(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=azam.ali"));
        startActivity(browserIntent);
    }

    public void browser18(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=abdullahshariff"));
        startActivity(browserIntent);
    }

    public void browser19(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=hamraj"));
        startActivity(browserIntent);
    }

    public void browser20(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=masihuddin"));
        startActivity(browserIntent);
    }

    public void browser21(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=moinuddinahmed"));
        startActivity(browserIntent);
    }

    public void browser22(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mrinal.gour"));
        startActivity(browserIntent);
    }

    public void browser23(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=farooqbasha"));
        startActivity(browserIntent);
    }

    public void browser24(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=saranaaz"));
        startActivity(browserIntent);
    }

    public void browser25(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shakeelayjaz"));
        startActivity(browserIntent);
    }

    public void browser26(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=suhashini"));
        startActivity(browserIntent);
    }

    public void browser27(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sumaiyafatima"));
        startActivity(browserIntent);
    }

    public void browser28(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=syed.jawwad"));
        startActivity(browserIntent);
    }

    public void browser29(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=syed.saifuddin"));
        startActivity(browserIntent);
    }

    public void browser30(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sshaq"));
        startActivity(browserIntent);
    }

    public void browser31(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresources.php"));
        startActivity(browserIntent);
    }

    public void browser32(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresources.php"));
        startActivity(browserIntent);
    }

    public void browser33(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=toufeeqanwar"));
        startActivity(browserIntent);
    }

    public void cbrowser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=afreensultana"));
        startActivity(browserIntent);
    }

    public void cbrowser2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ahmed"));
        startActivity(browserIntent);
    }

    public void cbrowser3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:..mjcollege.ac.in"));
        startActivity(browserIntent);
    }

    public void cbrowser4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=amena.yasmeen"));
        startActivity(browserIntent);
    }

    public void cbrowser5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ftaranum"));
        startActivity(browserIntent);
    }

    public void cbrowser6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=farheen.iqbal"));
        startActivity(browserIntent);
    }

    public void cbrowser7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=gouripatil"));
        startActivity(browserIntent);
    }

    public void cbrowser8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=jsrinivas"));
        startActivity(browserIntent);
    }

    public void cbrowser9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=kmanmohan"));
        startActivity(browserIntent);
    }

    public void cbrowser10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ksniraja"));
        startActivity(browserIntent);
    }

    public void cbrowser11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sridevi"));
        startActivity(browserIntent);
    }

    public void cbrowser12(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=subbareddy"));
        startActivity(browserIntent);
    }

    public void cbrowser13(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=zahooruddin"));
        startActivity(browserIntent);
    }

    public void cbrowser14(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=krishna.keerthi"));
        startActivity(browserIntent);
    }

    public void cbrowser15(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=manjusha"));
        startActivity(browserIntent);
    }

    public void cbrowser16(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=saleemkhan"));
        startActivity(browserIntent);
    }

    public void cbrowser17(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=zainuddin"));
        startActivity(browserIntent);
    }

    public void cbrowser18(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=arshadali"));
        startActivity(browserIntent);
    }

    public void cbrowser19(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=majabbar"));
        startActivity(browserIntent);
    }

    public void cbrowser20(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mir.ahmedali"));
        startActivity(browserIntent);
    }

    public void cbrowser21(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=gousebaig"));
        startActivity(browserIntent);
    }

    public void cbrowser22(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=maraheem"));
        startActivity(browserIntent);
    }

    public void cbrowser23(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mohammed.ahmed"));
        startActivity(browserIntent);
    }

    public void cbrowser24(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mohd.imran"));
        startActivity(browserIntent);
    }

    public void cbrowser25(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mahmood"));
        startActivity(browserIntent);
    }

    public void cbrowser26(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=nazeer"));
        startActivity(browserIntent);
    }

    public void cbrowser27(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void cbrowser28(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shabaz.hussain"));
        startActivity(browserIntent);
    }

    public void cbrowser29(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sharfuddin"));
        startActivity(browserIntent);
    }

    public void cbrowser30(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=umarfarooq"));
        startActivity(browserIntent);
    }

    public void cbrowser31(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=naimoonisa"));
        startActivity(browserIntent);
    }

    public void cbrowser32(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=rafi.u.zaman"));
        startActivity(browserIntent);
    }

    public void cbrowser33(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=rajesham.gajula"));
        startActivity(browserIntent);
    }

    public void cbrowser34(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void cbrowser35(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=akbar.hashmi"));
        startActivity(browserIntent);
    }

    public void cbrowser36(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=syed"));
        startActivity(browserIntent);
    }

    public void cbrowser37(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=salman.ali"));
        startActivity(browserIntent);
    }

    public void cbrowser38(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void cbrowser39(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ambareen.rana"));
        startActivity(browserIntent);
    }

    public void ebrowser1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=fatimaeee"));
        startActivity(browserIntent);
    }

    public void ebrowser2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=bibimariyam"));
        startActivity(browserIntent);
    }

    public void ebrowser3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=fabia.akbar"));
        startActivity(browserIntent);
    }

    public void ebrowser4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ravikiraneed"));
        startActivity(browserIntent);
    }

    public void ebrowser5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=muralidhareed"));
        startActivity(browserIntent);
    }

    public void ebrowser6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=jvrvithal"));
        startActivity(browserIntent);
    }

    public void ebrowser7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=jaffereed"));
        startActivity(browserIntent);
    }

    public void ebrowser8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=rafi.eee"));
        startActivity(browserIntent);
    }

    public void ebrowser9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sasidhareed"));
        startActivity(browserIntent);
    }

    public void ebrowser10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sonieed"));
        startActivity(browserIntent);
    }

    public void ebrowser11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mahaboobeed"));
        startActivity(browserIntent);
    }

    public void ebrowser12(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mubeeneed"));
        startActivity(browserIntent);
    }

    public void ebrowser13(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=abdullaheed"));
        startActivity(browserIntent);
    }

    public void ebrowser14(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=haseebkhaneed"));
        startActivity(browserIntent);
    }

    public void ebrowser15(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=umairquadri"));
        startActivity(browserIntent);
    }

    public void ebrowser16(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=imraneed"));
        startActivity(browserIntent);
    }

    public void ebrowser17(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sajideed"));
        startActivity(browserIntent);
    }

    public void ebrowser18(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=muqeeteed"));
        startActivity(browserIntent);
    }

    public void ebrowser19(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ismaileed"));
        startActivity(browserIntent);
    }

    public void ebrowser20(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=narjisbegumeed"));
        startActivity(browserIntent);
    }

    public void ebrowser21(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=nausheeneed"));
        startActivity(browserIntent);
    }

    public void ebrowser22(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=pbharathi"));
        startActivity(browserIntent);
    }

    public void ebrowser23(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=saikrishnaeed"));
        startActivity(browserIntent);
    }

    public void ebrowser24(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=joshieed"));
        startActivity(browserIntent);
    }

    public void ebrowser25(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shaikqadeer"));
        startActivity(browserIntent);
    }

    public void ebrowser26(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shaziaeed"));
        startActivity(browserIntent);
    }

    public void ebrowser27(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=srujanaeed"));
        startActivity(browserIntent);
    }

    public void ebrowser28(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mahamoodali"));
        startActivity(browserIntent);
    }

    public void cbutton1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=arif.sohel"));
        startActivity(browserIntent);
    }

    public void cbutton2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ayeshanaaz"));
        startActivity(browserIntent);
    }

    public void cbutton3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sucharithanagulapally"));
        startActivity(browserIntent);
    }

    public void cbutton4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=g.prashanthi"));
        startActivity(browserIntent);
    }

    public void cbutton5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=gabar"));
        startActivity(browserIntent);
    }

    public void cbutton6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=aejazaslam"));
        startActivity(browserIntent);
    }

    public void cbutton7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=iftequaruddin"));
        startActivity(browserIntent);
    }

    public void cbutton8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=prasanthkumar"));
        startActivity(browserIntent);
    }

    public void cbutton9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=jaideep.nag"));
        startActivity(browserIntent);
    }

    public void cbutton10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=kaleemfatima"));
        startActivity(browserIntent);
    }

    public void cbutton11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=lakshmi.prasanna"));
        startActivity(browserIntent);
    }

    public void cbutton12(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sabirhussain"));
        startActivity(browserIntent);
    }

    public void cbutton13(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=maliha.naaz"));
        startActivity(browserIntent);
    }

    public void cbutton14(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mazhar.hussain"));
        startActivity(browserIntent);
    }

    public void cbutton15(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void cbutton16(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=noorullah.khan"));
        startActivity(browserIntent);
    }

    public void cbutton17(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=zakir.hussain"));
        startActivity(browserIntent);
    }

    public void cbutton18(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=abdulraheem"));
        startActivity(browserIntent);
    }

    public void cbutton19(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=imtiaz"));
        startActivity(browserIntent);
    }

    public void cbutton20(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=muneeruddin"));
        startActivity(browserIntent);
    }

    public void cbutton21(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=nazeerunnisa"));
        startActivity(browserIntent);
    }

    public void cbutton22(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=nazia"));
        startActivity(browserIntent);
    }

    public void cbutton23(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=kamalakumari"));
        startActivity(browserIntent);
    }

    public void cbutton24(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=rafathunnisa"));
        startActivity(browserIntent);
    }

    public void cbutton25(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=rehana.farheen"));
        startActivity(browserIntent);
    }

    public void cbutton26(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ahmeduddinzakir"));
        startActivity(browserIntent);
    }

    public void cbutton27(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=salmafauzia"));
        startActivity(browserIntent);
    }

    public void cbutton28(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sabeerakhader"));
        startActivity(browserIntent);
    }

    public void cbutton29(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shubhangisaxena"));
        startActivity(browserIntent);
    }

    public void cbutton30(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=subhanvali"));
        startActivity(browserIntent);
    }

    public void cbutton31(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=hifazath"));
        startActivity(browserIntent);
    }

    public void mbutton1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=asreddy"));
        startActivity(browserIntent);
    }

    public void mbutton2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=raheem.junaidi"));
        startActivity(browserIntent);
    }

    public void mbutton3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=afrozmehar"));
        startActivity(browserIntent);
    }

    public void mbutton4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void mbutton5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=dhanrajpamar"));
        startActivity(browserIntent);
    }

    public void mbutton6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=dhanrajpamar"));
        startActivity(browserIntent);
    }

    public void mbutton7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=dharamsingh"));
        startActivity(browserIntent);
    }

    public void mbutton8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=bhasker"));
        startActivity(browserIntent);
    }

    public void mbutton9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=gmsayeed"));
        startActivity(browserIntent);
    }

    public void mbutton10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=gprasanna"));
        startActivity(browserIntent);
    }

    public void mbutton11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sailajasinha"));
        startActivity(browserIntent);
    }

    public void mbutton12(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=hakeemuddin"));
        startActivity(browserIntent);
    }

    public void mbutton13(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=hkdora"));
        startActivity(browserIntent);
    }

    public void mbutton14(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ishratmirzana"));
        startActivity(browserIntent);
    }

    public void mbutton15(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=jgkonnully"));
        startActivity(browserIntent);
    }

    public void mbutton16(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=hemalatha"));
        startActivity(browserIntent);
    }

    public void mbutton17(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=knkrishnan"));
        startActivity(browserIntent);
    }

    public void mbutton18(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mraju"));
        startActivity(browserIntent);
    }

    public void mbutton19(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sowjanya"));
        startActivity(browserIntent);
    }

    public void mbutton20(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mujeebiqbal"));
        startActivity(browserIntent);
    }

    public void mbutton21(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mdviquar"));
        startActivity(browserIntent);
    }

    public void mbutton22(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mdyahiya"));
        startActivity(browserIntent);
    }

    public void mbutton23(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=hashamali"));
        startActivity(browserIntent);
    }

    public void mbutton24(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=masamad"));
        startActivity(browserIntent);
    }

    public void mbutton25(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mohinoddin"));
        startActivity(browserIntent);
    }

    public void mbutton26(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sadak.ali"));
        startActivity(browserIntent);
    }

    public void mbutton27(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void mbutton28(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=lakshmi.kumari"));
        startActivity(browserIntent);
    }

    public void mbutton29(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=naseema"));
        startActivity(browserIntent);
    }

    public void mbutton30(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void mbutton31(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=irfan.sadaq"));
        startActivity(browserIntent);
    }

    public void mbutton32(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ssbanu"));
        startActivity(browserIntent);
    }

    public void mbutton33(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=khadar.vali"));
        startActivity(browserIntent);
    }

    public void mbutton34(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sirajkhany"));
        startActivity(browserIntent);
    }

    public void mbutton35(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=suvarna.kumar"));
        startActivity(browserIntent);
    }

    public void mbutton36(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=syedadil"));
        startActivity(browserIntent);
    }

    public void mbutton37(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void mbutton38(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=khader.basha"));
        startActivity(browserIntent);
    }

    public void mbutton39(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=nawazishmehdi"));
        startActivity(browserIntent);
    }

    public void mbutton40(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=syedaromana"));
        startActivity(browserIntent);
    }

    public void ibutton1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=afshan.kaleem"));
        startActivity(browserIntent);
    }

    public void ibutton2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=alefiah.mubeen"));
        startActivity(browserIntent);
    }

    public void ibutton3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=arifhussain"));
        startActivity(browserIntent);
    }

    public void ibutton4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=asia.sultana"));
        startActivity(browserIntent);
    }

    public void ibutton5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=asrar.ahmed"));
        startActivity(browserIntent);
    }

    public void ibutton6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=farha"));
        startActivity(browserIntent);
    }

    public void ibutton7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=g.vani"));
        startActivity(browserIntent);
    }

    public void ibutton8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=himayat.sharief"));
        startActivity(browserIntent);
    }

    public void ibutton9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=k.ramu"));
        startActivity(browserIntent);
    }

    public void ibutton10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=marasheed"));
        startActivity(browserIntent);
    }

    public void ibutton11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=venkata.prasad"));
        startActivity(browserIntent);
    }

    public void ibutton12(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=manizahijab"));
        startActivity(browserIntent);
    }

    public void ibutton13(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mdibrahim"));
        startActivity(browserIntent);
    }

    public void ibutton14(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=abdulwajid"));
        startActivity(browserIntent);
    }

    public void ibutton15(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mdafroze"));
        startActivity(browserIntent);
    }

    public void ibutton16(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mdpasha"));
        startActivity(browserIntent);
    }

    public void ibutton17(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=riyaz"));
        startActivity(browserIntent);
    }

    public void ibutton18(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sarfaraz.ahmed"));
        startActivity(browserIntent);
    }

    public void ibutton19(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=tahaseen"));
        startActivity(browserIntent);
    }

    public void ibutton20(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=jubairbasha"));
        startActivity(browserIntent);
    }

    public void ibutton21(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=hajera"));
        startActivity(browserIntent);
    }

    public void ibutton22(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shaikrasool"));
        startActivity(browserIntent);
    }

    public void ibutton23(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=syedazarali"));
        startActivity(browserIntent);
    }

    public void ibutton24(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=fouzia"));
        startActivity(browserIntent);
    }

    public void ibutton25(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=uma.dulhare"));
        startActivity(browserIntent);
    }

    public void gbutton1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void gbutton2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=asgar.khan"));
        startActivity(browserIntent);
    }

    public void gbutton3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=asma.sultana"));
        startActivity(browserIntent);
    }

    public void gbutton4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=iffat.naseem"));
        startActivity(browserIntent);
    }

    public void gbutton5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=azhar.ali"));
        startActivity(browserIntent);
    }

    public void gbutton6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=irfan.ali"));
        startActivity(browserIntent);
    }

    public void gbutton7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mdirfan"));
        startActivity(browserIntent);
    }

    public void gbutton8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=oumama.govher"));
        startActivity(browserIntent);
    }

    public void gbutton9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=qamarsultana"));
        startActivity(browserIntent);
    }

    public void gbutton10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=salma.sultana"));
        startActivity(browserIntent);
    }

    public void gbutton11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=muzammil.shah"));
        startActivity(browserIntent);
    }

    public void gbutton12(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=yousuf.hussaini"));
        startActivity(browserIntent);
    }

    public void gbutton13(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=bharat.kumar"));
        startActivity(browserIntent);
    }

    public void mabutton1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=abdulmajeed.maths"));
        startActivity(browserIntent);
    }

    public void mabutton2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=hussain.basha"));
        startActivity(browserIntent);
    }

    public void mabutton3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ismathaijaz"));
        startActivity(browserIntent);
    }

    public void mabutton4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=haleemrizwan"));
        startActivity(browserIntent);
    }

    public void mabutton5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mpoorvanthi"));
        startActivity(browserIntent);
    }

    public void mabutton6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=rfsayeed"));
        startActivity(browserIntent);
    }

    public void mabutton7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=naheed"));
        startActivity(browserIntent);
    }

    public void mabutton8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sameenamujeeb"));
        startActivity(browserIntent);
    }

    public void mabutton9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=nuslin"));
        startActivity(browserIntent);
    }

    public void mabutton10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=amanullah"));
        startActivity(browserIntent);
    }

    public void mabutton11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void pbutton1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=abdulgaffoor"));
        startActivity(browserIntent);
    }

    public void pbutton2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=rakeshnarwa"));
        startActivity(browserIntent);
    }

    public void pbutton3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=kareem.ahmed"));
        startActivity(browserIntent);
    }

    public void pbutton4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=prof_khadeer"));
        startActivity(browserIntent);
    }

    public void pbutton5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void pbutton6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ehteshamuddin"));
        startActivity(browserIntent);
    }

    public void pbutton7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mdraheem"));
        startActivity(browserIntent);
    }

    public void pbutton8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(browserIntent);
    }

    public void pbutton9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=prashantvaidya"));
        startActivity(browserIntent);
    }

    public void pbutton10(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=profshaikzameeruddin"));
        startActivity(browserIntent);
    }

    public void pbutton11(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=ilyas.mohiuddin"));
        startActivity(browserIntent);
    }

    public void chbutton1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=amina"));
        startActivity(browserIntent);
    }

    public void chbutton2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=aneesaf"));
        startActivity(browserIntent);
    }

    public void chbutton3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=kmashareef"));
        startActivity(browserIntent);
    }

    public void chbutton4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shobharani"));
        startActivity(browserIntent);
    }

    public void chbutton5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=sariah.sana"));
        startActivity(browserIntent);
    }

    public void chbutton6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=mgvs"));
        startActivity(browserIntent);
    }

    public void chbutton7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=arshia.banu"));
        startActivity(browserIntent);
    }

    public void chbutton8(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=v.shanthi"));
        startActivity(browserIntent);
    }

    public void chbutton9(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=arunkumar"));
        startActivity(browserIntent);
    }

    public void enbutton1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=anjum"));
        startActivity(browserIntent);
    }

    public void enbutton2(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=gita"));
        startActivity(browserIntent);
    }

    public void enbutton3(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=nirmalanair"));
        startActivity(browserIntent);
    }

    public void enbutton4(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shabana"));
        startActivity(browserIntent);
    }

    public void enbutton5(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=smdkhan"));
        startActivity(browserIntent);
    }

    public void enbutton6(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=shouketahmad"));
        startActivity(browserIntent);
    }

    public void enbutton7(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentresourceslist.php?resourceusername=anitha"));
        startActivity(browserIntent);
    }

    public void acmfb(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/blitzkrieg2010/?fref=ts"));
        startActivity(browserIntent);
    }

    public void acmw(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcet.acm.org/"));
        startActivity(browserIntent);
    }

    public void ic(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.indianconcreteinstitute.org/"));
        startActivity(browserIntent);
    }

    public void icfb(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/icimjcetstudentchapter/?fref=ts"));
        startActivity(browserIntent);
    }

    public void cs(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.csi-india.org/"));
        startActivity(browserIntent);
    }

    public void csfb(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/csimjcet/"));
        startActivity(browserIntent);
    }

    public void robo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://roboticsmjcet.com/"));
        startActivity(browserIntent);
    }

    public void robofb(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/roboticsmjcet/?ref=br_rs&qsefr=1"));
        startActivity(browserIntent);
    }

    public void ora(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mjcollege.ac.in/studentChapters/Orator/"));
        startActivity(browserIntent);
    }

    public void orafb(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Orators-Club-MJCET-184990698361498/"));
        startActivity(browserIntent);
    }

    public void ew(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ewb-india.org//"));
        startActivity(browserIntent);
    }

    public void ewfb(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/EWBMJCETCHAPTER/"));
        startActivity(browserIntent);
    }

    public void iee(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ewh.ieee.org/r10/india_council/"));
        startActivity(browserIntent);
    }

    public void ieefb(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ieeemjcet/"));
        startActivity(browserIntent);
    }
}
