package com.example.createview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.createview.model.Person;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.profile_img)
    ImageView profileImg;
    @BindView(R.id.profile_name)
    TextView profileName;

    @BindView(R.id.person_name)
    TextView personName;
    @BindView(R.id.person_img)
    CircleImageView personImg;

    @BindView(R.id.profile_description)
    TextView profileDescription;

    @BindView(R.id.followers_number_tv)
    TextView followersNumberTv;

    @BindView(R.id.following_number_tv)
    TextView followingNumberTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setDataInToView();
    }

    private void setDataInToView() {

        Person profile = buildProfile();
        String fullName = profile.getName() + " " + profile.getSurname();
        profileName.setText(fullName);
        profileDescription.setText(profile.getDescription());
        followersNumberTv.setText(profile.getFollowersNumber());
        followingNumberTv.setText(profile.getFollowingNumber());
        Picasso.with(this).load(profile.getImage()).into(profileImg);

        Person person = buildPerson();
        personName.setText(person.getName());
        Picasso.with(this).load(person.getImage()).into(personImg);

    }

    private Person buildPerson() {

        return Person
                .builder()
                .name("Jenifer86")
                .image("https://www.seo-services-consultants.com/media/clients/Patrick_henry.jpg")
                .build();
    }

    private Person buildProfile() {
        return Person
                .builder()
                .name("Michelle")
                .surname("Reed")
                .description("Model living in Los Angeles.Follow me for permium content and join me on all of my advertures")
                .followersNumber("768")
                .followingNumber("34")
                .image("https://makeupkey.ru/wp-content/uploads/2017/10/02_%D0%BC%D0%B0%D0%BA%D0%B8%D1%8F%D0%B6-1.jpg")
                .build();
    }
}
