package wodge.programming.flags.model

import io.reactivex.Single
import wodge.programming.flags.di.DaggerApiComponent
import javax.inject.Inject


class CountriesService {

    @Inject
    lateinit var api: CountriesApi

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }
}