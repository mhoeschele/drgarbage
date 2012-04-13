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

package com.drgarbage.graphml;

public interface GraphMlConstants {
	public static final String GRAPH_ML_EXPORT_STUB = 
		"<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
		+"<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\""  
		+" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\""
		+" xsi:schemaLocation=\"http://graphml.graphdrawing.org/xmlns http://graphml.graphdrawing.org/xmlns/1.0/graphml.xsd\">"
		+"<graph>"
		+"</graph>"
		+"</graphml>"
		;
}
