// Copyright 2014 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.devtools.build.lib.rules.python;

/**
 * Enumerates the different modes of Python precompilation.
 *
 * <p>NONE denotes that no precompilation should take place, and PROTO causes
 * only the generated _pb/_pb2.py files to be precompiled. ALL compiles all
 * Python files.
 */
public enum PrecompilePythonMode {
  NONE, PROTO, ALL;
}
