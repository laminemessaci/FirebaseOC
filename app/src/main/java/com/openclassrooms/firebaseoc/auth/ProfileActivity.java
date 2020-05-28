package com.openclassrooms.firebaseoc.auth;

import android.support.design.widget.TextInputEditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.openclassrooms.firebaseoc.R;
import com.openclassrooms.firebaseoc.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by Lamine MESSACI on 27/05/2020.
 */
public class ProfileActivity extends BaseActivity {
    //FOR DESIGN
    @BindView(R.id.profile_activity_imageview_profile) ImageView imageViewProfile;
    @BindView(R.id.profile_activity_edit_text_username) TextInputEditText textInputEditTextUsername;
    @BindView(R.id.profile_activity_text_view_email) TextView textViewEmail;
    @BindView(R.id.profile_activity_progress_bar) ProgressBar progressBar;

    @Override
    public int getFragmentLayout() {
        return 0;
    }
}
