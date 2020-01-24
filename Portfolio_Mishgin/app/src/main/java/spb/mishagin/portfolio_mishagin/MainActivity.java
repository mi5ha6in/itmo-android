package spb.mishagin.portfolio_mishagin;

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
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Fragment fragment = null;
        Class fragmentClass = AboutMeFragment.class;

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
                        new ProfileDrawerItem()
                                .withName("Mishagin Dmitry")
                                .withEmail("mi5ha6in@gmail.com")
                                .withIcon(getResources().getDrawable(R.drawable.avatar))
                )
                .build();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackground(getResources().getDrawable(R.color.md_dark_appbar));

        setSupportActionBar(toolbar);

        PrimaryDrawerItem item1 = new PrimaryDrawerItem()
                .withName("About me")
                .withIcon(FontAwesome.Icon.faw_home);
        PrimaryDrawerItem item2 = new PrimaryDrawerItem()
                .withName("My Plans")
                .withIcon(FontAwesome.Icon.faw_calendar_check);
        PrimaryDrawerItem item3 = new PrimaryDrawerItem()
                .withName("My Education")
                .withIcon(FontAwesome.Icon.faw_book);
        PrimaryDrawerItem item4 = new PrimaryDrawerItem()
                .withName("My Dissertation")
                .withIcon(FontAwesome.Icon.faw_bookmark);
        PrimaryDrawerItem item5 = new PrimaryDrawerItem()
                .withName("My contacts")
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
                        item5
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        Fragment fragment = null;
                        Class fragmentClass = null;

                        switch (position) {
                            case 1:
                                fragmentClass = AboutMeFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("About me");
                                break;
                            case 2:
                                fragmentClass = MyPlansFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("My Plans");
                                break;
                            case 3:
                                fragmentClass = MyEducationFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("My Education");
                                break;
                            case 4:
                                fragmentClass = MyDissertationFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("My Dissertation");
                                break;
                            case 5:
                                fragmentClass = MyContactsFragment.class;
                                Objects.requireNonNull(getSupportActionBar()).setTitle("My contacts");
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




