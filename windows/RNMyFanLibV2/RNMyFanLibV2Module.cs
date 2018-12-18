using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace My.Fan.Lib.V2.RNMyFanLibV2
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNMyFanLibV2Module : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNMyFanLibV2Module"/>.
        /// </summary>
        internal RNMyFanLibV2Module()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNMyFanLibV2";
            }
        }
    }
}
