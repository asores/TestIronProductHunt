package com.producthuntpost.ui.fragments.detailsuser;


import com.makeramen.roundedimageview.RoundedImageView;
import com.producthuntpost.model.Post;
import com.producthuntpost.model.posts.details.Vote;
import com.producthuntpost.model.users.UserDetailsModel;

import java.util.List;

public interface IUserDetailsPresenter {
    void setView(IUserDetailsView view);
    void requestUserDetails(int idUser);
    UserDetailsModel getUserDetails();
    List<Post> getListPostsUser();
    List<Vote> getListVotesUser();
    String getNameUser();
    String getHeadLineUser();
    void setAvatarUser(RoundedImageView imgAvatarUser);

}
