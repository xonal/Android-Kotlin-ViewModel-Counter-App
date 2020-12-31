# Android-Kotlin-ViewModel-Counter-App
So what is ViewModel? **ViewModel** is one of many architecture component android for maintain data from re-create UI activity. what does it mean?
Check this out :point_down: :point_down: :point_down:


## Without ViewModel

When you create simple app to increase a number like below, you must maintain the data with the current number. But, how if you rotate your phone? right!, the **number** data will be reset and start from 0.

<p align="center">
  <img width="700" height="320" src="https://user-images.githubusercontent.com/34072106/103389668-1ec26080-4ac5-11eb-9c16-20f9f50848cb.png">
</p>

Therefore it should be maintain with **viewModel**

## How ViewModel Work

![viewModel](https://user-images.githubusercontent.com/34072106/103391111-99db4500-4acc-11eb-9931-b58129b41c9e.png)

* First, on the example image. Activity was create must call initialize ViewModel.
* Second, the **data** **number** from ViewModel called to show on the text
* Finish! data was maintained from the rotate screen


## After Work With ViewModel
<p align="center">
  <img width="700" height="370" src="https://user-images.githubusercontent.com/34072106/103391941-71ede080-4ad0-11eb-91b4-405f3687638c.png">
</p>

## Reference

[Youtube Stevdza-San](https://www.youtube.com/channel/UCYLAirIEMMXtWOECuZAtjqQ)


