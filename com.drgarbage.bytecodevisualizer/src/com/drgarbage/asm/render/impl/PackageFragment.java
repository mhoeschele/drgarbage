/**
 * Copyright (c) 2008-2012, Dr. Garbage Community
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.drgarbage.asm.render.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IBuffer;
import org.eclipse.jdt.core.IClassFile;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IModularClassFile;
import org.eclipse.jdt.core.IOrdinaryClassFile;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.WorkingCopyOwner;

public class PackageFragment extends OutlineElement implements IPackageFragment {

	public PackageFragment(int arg0) {
		super(arg0);
	}

	@Override
	public boolean containsJavaResources() throws JavaModelException {
		return false;
	}

	@Override
	public ICompilationUnit createCompilationUnit(String name, String contents,
			boolean force, IProgressMonitor monitor) throws JavaModelException {
		return null;
	}

	@Override
	public IClassFile getClassFile(String name) {
		return null;
	}

	@Override
	public IClassFile[] getClassFiles() throws JavaModelException {
		return null;
	}

	@Override
	public ICompilationUnit getCompilationUnit(String name) {
		return null;
	}

	@Override
	public ICompilationUnit[] getCompilationUnits() throws JavaModelException {
		return null;
	}

	@Override
	public ICompilationUnit[] getCompilationUnits(WorkingCopyOwner owner)
			throws JavaModelException {
		return null;
	}

	@Override
	public int getKind() throws JavaModelException {
		return IPackageFragmentRoot.K_BINARY;
	}

	@Override
	public Object[] getNonJavaResources() throws JavaModelException {
		return null;
	}

	@Override
	public boolean hasSubpackages() throws JavaModelException {
		return false;
	}

	@Override
	public boolean isDefaultPackage() {
		return false;
	}

	@Override
	public void close() throws JavaModelException {
	}

	@Override
	public String findRecommendedLineSeparator() throws JavaModelException {
		return null;
	}

	@Override
	public IBuffer getBuffer() throws JavaModelException {
		return null;
	}

	@Override
	public boolean hasUnsavedChanges() throws JavaModelException {
		return false;
	}

	@Override
	public boolean isConsistent() throws JavaModelException {
		return false;
	}

	@Override
	public boolean isOpen() {
		return false;
	}

	@Override
	public void makeConsistent(IProgressMonitor progress)
			throws JavaModelException {
	}

	@Override
	public void open(IProgressMonitor progress) throws JavaModelException {
	}

	@Override
	public void save(IProgressMonitor progress, boolean force)
			throws JavaModelException {
	}

	@Override
	public void copy(IJavaElement container, IJavaElement sibling,
			String rename, boolean replace, IProgressMonitor monitor)
					throws JavaModelException {
	}

	@Override
	public void delete(boolean force, IProgressMonitor monitor)
			throws JavaModelException {
	}

	@Override
	public void move(IJavaElement container, IJavaElement sibling,
			String rename, boolean replace, IProgressMonitor monitor)
					throws JavaModelException {
	}

	@Override
	public void rename(String name, boolean replace, IProgressMonitor monitor)
			throws JavaModelException {
	}

	@Override
	public IClassFile[] getAllClassFiles() throws JavaModelException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IModularClassFile getModularClassFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IOrdinaryClassFile getOrdinaryClassFile(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IOrdinaryClassFile[] getOrdinaryClassFiles() throws JavaModelException {
		// TODO Auto-generated method stub
		return null;
	}

}
