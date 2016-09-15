package com.drgarbage.bytecodevisualizer;

import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.internal.debug.core.model.JDIStackFrame;
import org.eclipse.ui.IStartup;

import com.drgarbage.bytecodevisualizer.actions.DynamicPartsManager;
import com.drgarbage.bytecodevisualizer.sourcelookup.SourceDisplayAdapterFactory;

public class BytecodeVisualizerStartup implements IStartup {

    /* (non-Javadoc)
	 * @see org.eclipse.ui.IStartup#earlyStartup()
	 */
	@Override
	public void earlyStartup() {
		
		/* make sure the org.eclipse.debug.internal.ui.DebugUIPlugin gets loaded
		 * so that it registers its org.eclipse.core.runtime.adapters */
		org.eclipse.debug.internal.ui.DebugUIPlugin.getDefault();

		/* In the following, we want to overwrite one of the DebugUIPlugin's adapters */
		IAdapterManager manager= Platform.getAdapterManager();
		SourceDisplayAdapterFactory actionFactory = new SourceDisplayAdapterFactory();
		manager.registerAdapters(actionFactory, JDIStackFrame.class);

		BytecodeVisualizerPlugin.debugActionManager = new DynamicPartsManager();

	}

}
