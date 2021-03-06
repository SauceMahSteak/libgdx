/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btSequentialImpulseConstraintSolver extends btConstraintSolver {
	private long swigCPtr;
	
	protected btSequentialImpulseConstraintSolver(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btSequentialImpulseConstraintSolver_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btSequentialImpulseConstraintSolver, normally you should not need this constructor it's intended for low-level usage. */
	public btSequentialImpulseConstraintSolver(long cPtr, boolean cMemoryOwn) {
		this("btSequentialImpulseConstraintSolver", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btSequentialImpulseConstraintSolver_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btSequentialImpulseConstraintSolver obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				DynamicsJNI.delete_btSequentialImpulseConstraintSolver(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btSequentialImpulseConstraintSolver() {
    this(DynamicsJNI.new_btSequentialImpulseConstraintSolver(), true);
  }

  public long btRand2() {
    return DynamicsJNI.btSequentialImpulseConstraintSolver_btRand2(swigCPtr, this);
  }

  public int btRandInt2(int n) {
    return DynamicsJNI.btSequentialImpulseConstraintSolver_btRandInt2(swigCPtr, this, n);
  }

  public void setRandSeed(long seed) {
    DynamicsJNI.btSequentialImpulseConstraintSolver_setRandSeed(swigCPtr, this, seed);
  }

  public long getRandSeed() {
    return DynamicsJNI.btSequentialImpulseConstraintSolver_getRandSeed(swigCPtr, this);
  }

}
