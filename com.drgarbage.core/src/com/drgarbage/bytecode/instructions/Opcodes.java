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

package com.drgarbage.bytecode.instructions;

import com.drgarbage.bytecode.ByteCodeConstants;

/**
  *  Opcode constants. Use the {@link ByteCodeConstants#OPCODE_MNEMONICS} to map 
  *  the numeric opcodes to their textual mnemonics. 
  *
  *  @see ByteCodeConstants#OPCODE_MNEMONICS
  *
  * @author Sergej Alekseev and Peter Palaga
  *  @version $Revision:81 $
  *  $Id:Opcodes.java 81 2007-05-10 08:38:47Z Peter Palaga $
  */
public interface Opcodes {
    
    public static final int OPCODE_NOP = 0x00; 
    public static final int OPCODE_ACONST_NULL = 0x01; 
    public static final int OPCODE_ICONST_M1 = 0x02; 
    public static final int OPCODE_ICONST_0 = 0x03; 
    public static final int OPCODE_ICONST_1 = 0x04; 
    public static final int OPCODE_ICONST_2 = 0x05; 
    public static final int OPCODE_ICONST_3 = 0x06; 
    public static final int OPCODE_ICONST_4 = 0x07; 
    public static final int OPCODE_ICONST_5 = 0x08; 
    public static final int OPCODE_LCONST_0 = 0x09; 
    public static final int OPCODE_LCONST_1 = 0x0a; 
    public static final int OPCODE_FCONST_0 = 0x0b; 
    public static final int OPCODE_FCONST_1 = 0x0c; 
    public static final int OPCODE_FCONST_2 = 0x0d; 
    public static final int OPCODE_DCONST_0 = 0x0e; 
    public static final int OPCODE_DCONST_1 = 0x0f; 
    public static final int OPCODE_BIPUSH = 0x10; 
    public static final int OPCODE_SIPUSH = 0x11; 
    public static final int OPCODE_LDC = 0x12; 
    public static final int OPCODE_LDC_W = 0x13; 
    public static final int OPCODE_LDC2_W = 0x14; 
    public static final int OPCODE_ILOAD = 0x15; 
    public static final int OPCODE_LLOAD = 0x16; 
    public static final int OPCODE_FLOAD = 0x17; 
    public static final int OPCODE_DLOAD = 0x18; 
    public static final int OPCODE_ALOAD = 0x19; 
    public static final int OPCODE_ILOAD_0 = 0x1a; 
    public static final int OPCODE_ILOAD_1 = 0x1b; 
    public static final int OPCODE_ILOAD_2 = 0x1c; 
    public static final int OPCODE_ILOAD_3 = 0x1d; 
    public static final int OPCODE_LLOAD_0 = 0x1e; 
    public static final int OPCODE_LLOAD_1 = 0x1f; 
    public static final int OPCODE_LLOAD_2 = 0x20; 
    public static final int OPCODE_LLOAD_3 = 0x21; 
    public static final int OPCODE_FLOAD_0 = 0x22; 
    public static final int OPCODE_FLOAD_1 = 0x23; 
    public static final int OPCODE_FLOAD_2 = 0x24; 
    public static final int OPCODE_FLOAD_3 = 0x25; 
    public static final int OPCODE_DLOAD_0 = 0x26; 
    public static final int OPCODE_DLOAD_1 = 0x27; 
    public static final int OPCODE_DLOAD_2 = 0x28; 
    public static final int OPCODE_DLOAD_3 = 0x29; 
    public static final int OPCODE_ALOAD_0 = 0x2a; 
    public static final int OPCODE_ALOAD_1 = 0x2b; 
    public static final int OPCODE_ALOAD_2 = 0x2c; 
    public static final int OPCODE_ALOAD_3 = 0x2d; 
    public static final int OPCODE_IALOAD = 0x2e; 
    public static final int OPCODE_LALOAD = 0x2f; 
    public static final int OPCODE_FALOAD = 0x30; 
    public static final int OPCODE_DALOAD = 0x31; 
    public static final int OPCODE_AALOAD = 0x32; 
    public static final int OPCODE_BALOAD = 0x33; 
    public static final int OPCODE_CALOAD = 0x34; 
    public static final int OPCODE_SALOAD = 0x35; 
    public static final int OPCODE_ISTORE = 0x36; 
    public static final int OPCODE_LSTORE = 0x37; 
    public static final int OPCODE_FSTORE = 0x38; 
    public static final int OPCODE_DSTORE = 0x39; 
    public static final int OPCODE_ASTORE = 0x3a; 
    public static final int OPCODE_ISTORE_0 = 0x3b; 
    public static final int OPCODE_ISTORE_1 = 0x3c; 
    public static final int OPCODE_ISTORE_2 = 0x3d; 
    public static final int OPCODE_ISTORE_3 = 0x3e; 
    public static final int OPCODE_LSTORE_0 = 0x3f; 
    public static final int OPCODE_LSTORE_1 = 0x40; 
    public static final int OPCODE_LSTORE_2 = 0x41; 
    public static final int OPCODE_LSTORE_3 = 0x42; 
    public static final int OPCODE_FSTORE_0 = 0x43; 
    public static final int OPCODE_FSTORE_1 = 0x44; 
    public static final int OPCODE_FSTORE_2 = 0x45; 
    public static final int OPCODE_FSTORE_3 = 0x46; 
    public static final int OPCODE_DSTORE_0 = 0x47; 
    public static final int OPCODE_DSTORE_1 = 0x48; 
    public static final int OPCODE_DSTORE_2 = 0x49; 
    public static final int OPCODE_DSTORE_3 = 0x4a; 
    public static final int OPCODE_ASTORE_0 = 0x4b; 
    public static final int OPCODE_ASTORE_1 = 0x4c; 
    public static final int OPCODE_ASTORE_2 = 0x4d; 
    public static final int OPCODE_ASTORE_3 = 0x4e; 
    public static final int OPCODE_IASTORE = 0x4f; 
    public static final int OPCODE_LASTORE = 0x50; 
    public static final int OPCODE_FASTORE = 0x51; 
    public static final int OPCODE_DASTORE = 0x52; 
    public static final int OPCODE_AASTORE = 0x53; 
    public static final int OPCODE_BASTORE = 0x54; 
    public static final int OPCODE_CASTORE = 0x55; 
    public static final int OPCODE_SASTORE = 0x56; 
    public static final int OPCODE_POP = 0x57; 
    public static final int OPCODE_POP2 = 0x58; 
    public static final int OPCODE_DUP = 0x59; 
    public static final int OPCODE_DUP_X1 = 0x5a; 
    public static final int OPCODE_DUP_X2 = 0x5b; 
    public static final int OPCODE_DUP2 = 0x5c; 
    public static final int OPCODE_DUP2_X1 = 0x5d; 
    public static final int OPCODE_DUP2_X2 = 0x5e; 
    public static final int OPCODE_SWAP = 0x5f; 
    public static final int OPCODE_IADD = 0x60; 
    public static final int OPCODE_LADD = 0x61; 
    public static final int OPCODE_FADD = 0x62; 
    public static final int OPCODE_DADD = 0x63; 
    public static final int OPCODE_ISUB = 0x64;
    public static final int OPCODE_LSUB = 0x65; 
    public static final int OPCODE_FSUB = 0x66; 
    public static final int OPCODE_DSUB = 0x67; 
    public static final int OPCODE_IMUL = 0x68; 
    public static final int OPCODE_LMUL = 0x69; 
    public static final int OPCODE_FMUL = 0x6a; 
    public static final int OPCODE_DMUL = 0x6b; 
    public static final int OPCODE_IDIV = 0x6c; 
    public static final int OPCODE_LDIV = 0x6d; 
    public static final int OPCODE_FDIV = 0x6e; 
    public static final int OPCODE_DDIV = 0x6f; 
    public static final int OPCODE_IREM = 0x70; 
    public static final int OPCODE_LREM = 0x71; 
    public static final int OPCODE_FREM = 0x72; 
    public static final int OPCODE_DREM = 0x73; 
    public static final int OPCODE_INEG = 0x74; 
    public static final int OPCODE_LNEG = 0x75; 
    public static final int OPCODE_FNEG = 0x76; 
    public static final int OPCODE_DNEG = 0x77; 
    public static final int OPCODE_ISHL = 0x78; 
    public static final int OPCODE_LSHL = 0x79; 
    public static final int OPCODE_ISHR = 0x7a; 
    public static final int OPCODE_LSHR = 0x7b; 
    public static final int OPCODE_IUSHR = 0x7c; 
    public static final int OPCODE_LUSHR = 0x7d; 
    public static final int OPCODE_IAND = 0x7e; 
    public static final int OPCODE_LAND = 0x7f; 
    public static final int OPCODE_IOR = 0x80; 
    public static final int OPCODE_LOR = 0x81; 
    public static final int OPCODE_IXOR = 0x82; 
    public static final int OPCODE_LXOR = 0x83; 
    public static final int OPCODE_IINC = 0x84; 
    public static final int OPCODE_I2L = 0x85; 
    public static final int OPCODE_I2F = 0x86; 
    public static final int OPCODE_I2D = 0x87; 
    public static final int OPCODE_L2I = 0x88; 
    public static final int OPCODE_L2F = 0x89; 
    public static final int OPCODE_L2D = 0x8a; 
    public static final int OPCODE_F2I = 0x8b; 
    public static final int OPCODE_F2L = 0x8c; 
    public static final int OPCODE_F2D = 0x8d; 
    public static final int OPCODE_D2I = 0x8e; 
    public static final int OPCODE_D2L = 0x8f; 
    public static final int OPCODE_D2F = 0x90; 
    public static final int OPCODE_I2B = 0x91; 
    public static final int OPCODE_I2C = 0x92; 
    public static final int OPCODE_I2S = 0x93; 
    public static final int OPCODE_LCMP = 0x94; 
    public static final int OPCODE_FCMPL = 0x95; 
    public static final int OPCODE_FCMPG = 0x96; 
    public static final int OPCODE_DCMPL = 0x97; 
    public static final int OPCODE_DCMPG = 0x98; 
    public static final int OPCODE_IFEQ = 0x99; 
    public static final int OPCODE_IFNE = 0x9a; 
    public static final int OPCODE_IFLT = 0x9b; 
    public static final int OPCODE_IFGE = 0x9c; 
    public static final int OPCODE_IFGT = 0x9d; 
    public static final int OPCODE_IFLE = 0x9e; 
    public static final int OPCODE_IF_ICMPEQ = 0x9f; 
    public static final int OPCODE_IF_ICMPNE = 0xa0; 
    public static final int OPCODE_IF_ICMPLT = 0xa1; 
    public static final int OPCODE_IF_ICMPGE = 0xa2; 
    public static final int OPCODE_IF_ICMPGT = 0xa3; 
    public static final int OPCODE_IF_ICMPLE = 0xa4; 
    public static final int OPCODE_IF_ACMPEQ = 0xa5; 
    public static final int OPCODE_IF_ACMPNE = 0xa6; 
    public static final int OPCODE_GOTO = 0xa7; 
    public static final int OPCODE_JSR = 0xa8; 
    public static final int OPCODE_RET = 0xa9; 
    public static final int OPCODE_TABLESWITCH = 0xaa; 
    public static final int OPCODE_LOOKUPSWITCH = 0xab; 
    public static final int OPCODE_IRETURN = 0xac; 
    public static final int OPCODE_LRETURN = 0xad; 
    public static final int OPCODE_FRETURN = 0xae; 
    public static final int OPCODE_DRETURN = 0xaf; 
    public static final int OPCODE_ARETURN = 0xb0; 
    public static final int OPCODE_RETURN = 0xb1; 
    public static final int OPCODE_GETSTATIC = 0xb2; 
    public static final int OPCODE_PUTSTATIC = 0xb3; 
    public static final int OPCODE_GETFIELD = 0xb4; 
    public static final int OPCODE_PUTFIELD = 0xb5; 
    public static final int OPCODE_INVOKEVIRTUAL = 0xb6; 
    public static final int OPCODE_INVOKESPECIAL = 0xb7; 
    public static final int OPCODE_INVOKESTATIC = 0xb8; 
    public static final int OPCODE_INVOKEINTERFACE = 0xb9; 
    public static final int OPCODE_XXXUNUSEDXXX = 0xba; 
    public static final int OPCODE_NEW = 0xbb; 
    public static final int OPCODE_NEWARRAY = 0xbc; 
    public static final int OPCODE_ANEWARRAY = 0xbd; 
    public static final int OPCODE_ARRAYLENGTH = 0xbe; 
    public static final int OPCODE_ATHROW = 0xbf; 
    public static final int OPCODE_CHECKCAST = 0xc0; 
    public static final int OPCODE_INSTANCEOF = 0xc1; 
    public static final int OPCODE_MONITORENTER = 0xc2; 
    public static final int OPCODE_MONITOREXIT = 0xc3; 
    public static final int OPCODE_WIDE = 0xc4; 
    public static final int OPCODE_MULTIANEWARRAY = 0xc5; 
    public static final int OPCODE_IFNULL = 0xc6; 
    public static final int OPCODE_IFNONNULL = 0xc7; 
    public static final int OPCODE_GOTO_W = 0xc8; 
    public static final int OPCODE_JSR_W = 0xc9; 
    public static final int OPCODE_BREAKPOINT = 0xca; 
    public static final int OPCODE_IMPDEP1 = 0xfe; 
    public static final int OPCODE_IMPDEP2 = 0xff;
    
}
