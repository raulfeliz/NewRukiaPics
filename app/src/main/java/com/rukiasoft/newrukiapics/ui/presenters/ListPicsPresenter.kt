package com.rukiasoft.newrukiapics.ui.presenters

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.view.View
import com.rukiasoft.newrukiapics.model.Pic
import com.rukiasoft.newrukiapics.network.interfaces.NetworkManager
import com.rukiasoft.newrukiapics.ui.interfaces.ListPicsContracts
import com.rukiasoft.newrukiapics.utils.FlickrConstants
import javax.inject.Inject

/**
 * Created by Roll on 28/7/17.
 */
class ListPicsPresenter @Inject constructor() :ListPicsContracts.PresenterContracts {

    private var mView : ListPicsContracts.ViewContracts? = null

    @Inject
    protected lateinit var network : NetworkManager

    override fun downloadPics(listOfPics: MutableLiveData<List<Pic>>, tags: String, order: FlickrConstants.Order) {
        network?.getPics(tags = tags, order = order, listOfPics = listOfPics)
    }

    override fun observerListOfPics(pic: MutableLiveData<List<Pic>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setDataFromNetworkOrCache(pic: MutableLiveData<List<Pic>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun cardClicked(view: View, pic: Pic) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bindView(view: ListPicsContracts.ViewContracts) {
        mView = view;
    }

    override fun unbindView() {
        mView = null;
    }

}