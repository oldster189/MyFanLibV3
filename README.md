# react-native-my-fan-lib-v2

## Getting started

`$ npm install react-native-my-fan-lib-v2 --save`

### Mostly automatic installation

`$ react-native link react-native-my-fan-lib-v2`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-my-fan-lib-v2` and add `RNMyFanLibV2.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNMyFanLibV2.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.oldster.test.RNMyFanLibV2Package;` to the imports at the top of the file
  - Add `new RNMyFanLibV2Package()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-my-fan-lib-v2'
  	project(':react-native-my-fan-lib-v2').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-my-fan-lib-v2/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-my-fan-lib-v2')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNMyFanLibV2.sln` in `node_modules/react-native-my-fan-lib-v2/windows/RNMyFanLibV2.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using My.Fan.Lib.V2.RNMyFanLibV2;` to the usings at the top of the file
  - Add `new RNMyFanLibV2Package()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNMyFanLibV2 from 'react-native-my-fan-lib-v2';

// TODO: What to do with the module?
RNMyFanLibV2;
```
  