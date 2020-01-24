package spb.mishagin.lab5_mishagin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;


import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment fragment = null;
        Class fragmentClass = HomeFragment.class;

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .addToBackStack(null)
                .commit();


        AccountHeader accountHeader = new AccountHeaderBuilder()
                .withActivity(this)
                .withTranslucentStatusBar(true)
                .addProfiles(
                        new ProfileDrawerItem().withName("Mishagin Dmitry").withEmail("mi5ha6in@gmail.com")
                )
                .build();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackground(getResources().getDrawable(R.color.colorAccent));

        setSupportActionBar(toolbar);

        PrimaryDrawerItem item1 = new PrimaryDrawerItem()
                .withName("Home")
                .withIcon(FontAwesome.Icon.faw_home);
        PrimaryDrawerItem item2 = new PrimaryDrawerItem()
                .withName("About Android")
                .withIcon(FontAwesome.Icon.faw_android);
        PrimaryDrawerItem item3 = new PrimaryDrawerItem()
                .withName("Current version")
                .withIcon(FontAwesome.Icon.faw_calendar_check);
        PrimaryDrawerItem item4 = new PrimaryDrawerItem()
                .withName("All version")
                .withIcon(FontAwesome.Icon.faw_calendar_alt);
        SecondaryDrawerItem item5 = new SecondaryDrawerItem()
                .withName("Settings")
                .withIcon(FontAwesome.Icon.faw_cog);
        PrimaryDrawerItem item6 = new PrimaryDrawerItem()
                .withName("About us")
                .withIcon(FontAwesome.Icon.faw_address_card);
        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withAccountHeader(accountHeader)
                .withToolbar(toolbar)
                .addDrawerItems(
                        item1,
                        item2,
                        item3,
                        item4,
                        item5,
                        item6
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        Fragment fragment = null;
                        Class fragmentClass = null;

                        switch (position) {
                            case 1:
                                fragmentClass = HomeFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("Home");
                                break;
                            case 2:
                                fragmentClass = AboutAndroidFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("About Android");
                                break;
                            case 3:
                                fragmentClass = CurrentVersionFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("Current version");
                                break;
                            case 4:
                                fragmentClass = AllVersionFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("All version");
                                break;
                            case 5:
                                fragmentClass = SettingsFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("Settings");
                                break;
                            case 6:
                                fragmentClass = AboutUsFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("About us");
                                break;

                        }

                        try {
                            assert fragmentClass != null;
                            fragment = (Fragment) fragmentClass.newInstance();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        FragmentManager fragmentManager = getSupportFragmentManager();
                        fragmentManager.beginTransaction()
                                .replace(R.id.frame_layout, fragment)
                                .addToBackStack(null)
                                .commit();
                        return false;
                    }
                })
                .build();
    }

}




