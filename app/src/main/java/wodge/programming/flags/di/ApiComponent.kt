package wodge.programming.flags.di

import dagger.Component
import wodge.programming.flags.model.CountriesService
import wodge.programming.flags.viewmodel.ListViewModel

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModel: ListViewModel)
}