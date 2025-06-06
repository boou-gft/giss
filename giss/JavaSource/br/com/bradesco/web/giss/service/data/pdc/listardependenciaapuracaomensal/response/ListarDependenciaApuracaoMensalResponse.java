/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Vector;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarDependenciaApuracaoMensalResponse.
 * 
 * @version $Revision$ $Date$
 */
public class ListarDependenciaApuracaoMensalResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _totalMunicipioReceitaSinal
     */
    private java.lang.String _totalMunicipioReceitaSinal;

    /**
     * Field _totalMunicipioReceitaValor
     */
    private double _totalMunicipioReceitaValor = 0;

    /**
     * keeps track of state for field: _totalMunicipioReceitaValor
     */
    private boolean _has_totalMunicipioReceitaValor;

    /**
     * Field _totalMunicipioRecolherSinal
     */
    private java.lang.String _totalMunicipioRecolherSinal;

    /**
     * Field _totalMunicipioRecolherValor
     */
    private double _totalMunicipioRecolherValor = 0;

    /**
     * keeps track of state for field: _totalMunicipioRecolherValor
     */
    private boolean _has_totalMunicipioRecolherValor;

    /**
     * Field _totalGeralReceitaSinal
     */
    private java.lang.String _totalGeralReceitaSinal;

    /**
     * Field _totalGeralReceitaValor
     */
    private double _totalGeralReceitaValor = 0;

    /**
     * keeps track of state for field: _totalGeralReceitaValor
     */
    private boolean _has_totalGeralReceitaValor;

    /**
     * Field _totalGeralRecolherSinal
     */
    private java.lang.String _totalGeralRecolherSinal;

    /**
     * Field _totalGeralRecolherValor
     */
    private double _totalGeralRecolherValor = 0;

    /**
     * keeps track of state for field: _totalGeralRecolherValor
     */
    private boolean _has_totalGeralRecolherValor;

    /**
     * Field _qtdeAgencia
     */
    private long _qtdeAgencia = 0;

    /**
     * keeps track of state for field: _qtdeAgencia
     */
    private boolean _has_qtdeAgencia;

    /**
     * Field _totalAgenciaRecolherSinal
     */
    private java.lang.String _totalAgenciaRecolherSinal;

    /**
     * Field _totalAgenciaRecolherValor
     */
    private double _totalAgenciaRecolherValor = 0;

    /**
     * keeps track of state for field: _totalAgenciaRecolherValor
     */
    private boolean _has_totalAgenciaRecolherValor;

    /**
     * Field _totalAgenciaReceitaSinal
     */
    private java.lang.String _totalAgenciaReceitaSinal;

    /**
     * Field _totalAgenciaReceitaValor
     */
    private double _totalAgenciaReceitaValor = 0;

    /**
     * keeps track of state for field: _totalAgenciaReceitaValor
     */
    private boolean _has_totalAgenciaReceitaValor;

    /**
     * Field _qtdePa
     */
    private long _qtdePa = 0;

    /**
     * keeps track of state for field: _qtdePa
     */
    private boolean _has_qtdePa;

    /**
     * Field _totalPaRecolherSinal
     */
    private java.lang.String _totalPaRecolherSinal;

    /**
     * Field _totalPaRecolherValor
     */
    private double _totalPaRecolherValor = 0;

    /**
     * keeps track of state for field: _totalPaRecolherValor
     */
    private boolean _has_totalPaRecolherValor;

    /**
     * Field _totalPaReceitaSinal
     */
    private java.lang.String _totalPaReceitaSinal;

    /**
     * Field _totalPaReceitaValor
     */
    private double _totalPaReceitaValor = 0;

    /**
     * keeps track of state for field: _totalPaReceitaValor
     */
    private boolean _has_totalPaReceitaValor;

    /**
     * Field _numeroConsultas
     */
    private int _numeroConsultas = 0;

    /**
     * keeps track of state for field: _numeroConsultas
     */
    private boolean _has_numeroConsultas;

    /**
     * Field _ocorDependenciaApuracaoMensalList
     */
    private java.util.Vector _ocorDependenciaApuracaoMensalList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDependenciaApuracaoMensalResponse() 
     {
        super();
        _ocorDependenciaApuracaoMensalList = new Vector();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.ListarDependenciaApuracaoMensalResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorDependenciaApuracaoMensal
     * 
     * 
     * 
     * @param vOcorDependenciaApuracaoMensal
     */
    public void addOcorDependenciaApuracaoMensal(br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal vOcorDependenciaApuracaoMensal)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorDependenciaApuracaoMensalList.addElement(vOcorDependenciaApuracaoMensal);
    } //-- void addOcorDependenciaApuracaoMensal(br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal) 

    /**
     * Method addOcorDependenciaApuracaoMensal
     * 
     * 
     * 
     * @param index
     * @param vOcorDependenciaApuracaoMensal
     */
    public void addOcorDependenciaApuracaoMensal(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal vOcorDependenciaApuracaoMensal)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorDependenciaApuracaoMensalList.insertElementAt(vOcorDependenciaApuracaoMensal, index);
    } //-- void addOcorDependenciaApuracaoMensal(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal) 

    /**
     * Method deleteNumeroConsultas
     * 
     */
    public void deleteNumeroConsultas()
    {
        this._has_numeroConsultas= false;
    } //-- void deleteNumeroConsultas() 

    /**
     * Method deleteQtdeAgencia
     * 
     */
    public void deleteQtdeAgencia()
    {
        this._has_qtdeAgencia= false;
    } //-- void deleteQtdeAgencia() 

    /**
     * Method deleteQtdePa
     * 
     */
    public void deleteQtdePa()
    {
        this._has_qtdePa= false;
    } //-- void deleteQtdePa() 

    /**
     * Method deleteTotalAgenciaReceitaValor
     * 
     */
    public void deleteTotalAgenciaReceitaValor()
    {
        this._has_totalAgenciaReceitaValor= false;
    } //-- void deleteTotalAgenciaReceitaValor() 

    /**
     * Method deleteTotalAgenciaRecolherValor
     * 
     */
    public void deleteTotalAgenciaRecolherValor()
    {
        this._has_totalAgenciaRecolherValor= false;
    } //-- void deleteTotalAgenciaRecolherValor() 

    /**
     * Method deleteTotalGeralReceitaValor
     * 
     */
    public void deleteTotalGeralReceitaValor()
    {
        this._has_totalGeralReceitaValor= false;
    } //-- void deleteTotalGeralReceitaValor() 

    /**
     * Method deleteTotalGeralRecolherValor
     * 
     */
    public void deleteTotalGeralRecolherValor()
    {
        this._has_totalGeralRecolherValor= false;
    } //-- void deleteTotalGeralRecolherValor() 

    /**
     * Method deleteTotalMunicipioReceitaValor
     * 
     */
    public void deleteTotalMunicipioReceitaValor()
    {
        this._has_totalMunicipioReceitaValor= false;
    } //-- void deleteTotalMunicipioReceitaValor() 

    /**
     * Method deleteTotalMunicipioRecolherValor
     * 
     */
    public void deleteTotalMunicipioRecolherValor()
    {
        this._has_totalMunicipioRecolherValor= false;
    } //-- void deleteTotalMunicipioRecolherValor() 

    /**
     * Method deleteTotalPaReceitaValor
     * 
     */
    public void deleteTotalPaReceitaValor()
    {
        this._has_totalPaReceitaValor= false;
    } //-- void deleteTotalPaReceitaValor() 

    /**
     * Method deleteTotalPaRecolherValor
     * 
     */
    public void deleteTotalPaRecolherValor()
    {
        this._has_totalPaRecolherValor= false;
    } //-- void deleteTotalPaRecolherValor() 

    /**
     * Method enumerateOcorDependenciaApuracaoMensal
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration enumerateOcorDependenciaApuracaoMensal()
    {
        return _ocorDependenciaApuracaoMensalList.elements();
    } //-- java.util.Enumeration enumerateOcorDependenciaApuracaoMensal() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Returns the value of field 'numeroConsultas'.
     * 
     * @return int
     * @return the value of field 'numeroConsultas'.
     */
    public int getNumeroConsultas()
    {
        return this._numeroConsultas;
    } //-- int getNumeroConsultas() 

    /**
     * Method getOcorDependenciaApuracaoMensal
     * 
     * 
     * 
     * @param index
     * @return OcorDependenciaApuracaoMensal
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal getOcorDependenciaApuracaoMensal(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorDependenciaApuracaoMensalList.size())) {
            throw new IndexOutOfBoundsException("getOcorDependenciaApuracaoMensal: Index value '"+index+"' not in range [0.."+(_ocorDependenciaApuracaoMensalList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal) _ocorDependenciaApuracaoMensalList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal getOcorDependenciaApuracaoMensal(int) 

    /**
     * Method getOcorDependenciaApuracaoMensal
     * 
     * 
     * 
     * @return OcorDependenciaApuracaoMensal
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal[] getOcorDependenciaApuracaoMensal()
    {
        int size = _ocorDependenciaApuracaoMensalList.size();
        br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal) _ocorDependenciaApuracaoMensalList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal[] getOcorDependenciaApuracaoMensal() 

    /**
     * Method getOcorDependenciaApuracaoMensalCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorDependenciaApuracaoMensalCount()
    {
        return _ocorDependenciaApuracaoMensalList.size();
    } //-- int getOcorDependenciaApuracaoMensalCount() 

    /**
     * Returns the value of field 'qtdeAgencia'.
     * 
     * @return long
     * @return the value of field 'qtdeAgencia'.
     */
    public long getQtdeAgencia()
    {
        return this._qtdeAgencia;
    } //-- long getQtdeAgencia() 

    /**
     * Returns the value of field 'qtdePa'.
     * 
     * @return long
     * @return the value of field 'qtdePa'.
     */
    public long getQtdePa()
    {
        return this._qtdePa;
    } //-- long getQtdePa() 

    /**
     * Returns the value of field 'totalAgenciaReceitaSinal'.
     * 
     * @return String
     * @return the value of field 'totalAgenciaReceitaSinal'.
     */
    public java.lang.String getTotalAgenciaReceitaSinal()
    {
        return this._totalAgenciaReceitaSinal;
    } //-- java.lang.String getTotalAgenciaReceitaSinal() 

    /**
     * Returns the value of field 'totalAgenciaReceitaValor'.
     * 
     * @return double
     * @return the value of field 'totalAgenciaReceitaValor'.
     */
    public double getTotalAgenciaReceitaValor()
    {
        return this._totalAgenciaReceitaValor;
    } //-- double getTotalAgenciaReceitaValor() 

    /**
     * Returns the value of field 'totalAgenciaRecolherSinal'.
     * 
     * @return String
     * @return the value of field 'totalAgenciaRecolherSinal'.
     */
    public java.lang.String getTotalAgenciaRecolherSinal()
    {
        return this._totalAgenciaRecolherSinal;
    } //-- java.lang.String getTotalAgenciaRecolherSinal() 

    /**
     * Returns the value of field 'totalAgenciaRecolherValor'.
     * 
     * @return double
     * @return the value of field 'totalAgenciaRecolherValor'.
     */
    public double getTotalAgenciaRecolherValor()
    {
        return this._totalAgenciaRecolherValor;
    } //-- double getTotalAgenciaRecolherValor() 

    /**
     * Returns the value of field 'totalGeralReceitaSinal'.
     * 
     * @return String
     * @return the value of field 'totalGeralReceitaSinal'.
     */
    public java.lang.String getTotalGeralReceitaSinal()
    {
        return this._totalGeralReceitaSinal;
    } //-- java.lang.String getTotalGeralReceitaSinal() 

    /**
     * Returns the value of field 'totalGeralReceitaValor'.
     * 
     * @return double
     * @return the value of field 'totalGeralReceitaValor'.
     */
    public double getTotalGeralReceitaValor()
    {
        return this._totalGeralReceitaValor;
    } //-- double getTotalGeralReceitaValor() 

    /**
     * Returns the value of field 'totalGeralRecolherSinal'.
     * 
     * @return String
     * @return the value of field 'totalGeralRecolherSinal'.
     */
    public java.lang.String getTotalGeralRecolherSinal()
    {
        return this._totalGeralRecolherSinal;
    } //-- java.lang.String getTotalGeralRecolherSinal() 

    /**
     * Returns the value of field 'totalGeralRecolherValor'.
     * 
     * @return double
     * @return the value of field 'totalGeralRecolherValor'.
     */
    public double getTotalGeralRecolherValor()
    {
        return this._totalGeralRecolherValor;
    } //-- double getTotalGeralRecolherValor() 

    /**
     * Returns the value of field 'totalMunicipioReceitaSinal'.
     * 
     * @return String
     * @return the value of field 'totalMunicipioReceitaSinal'.
     */
    public java.lang.String getTotalMunicipioReceitaSinal()
    {
        return this._totalMunicipioReceitaSinal;
    } //-- java.lang.String getTotalMunicipioReceitaSinal() 

    /**
     * Returns the value of field 'totalMunicipioReceitaValor'.
     * 
     * @return double
     * @return the value of field 'totalMunicipioReceitaValor'.
     */
    public double getTotalMunicipioReceitaValor()
    {
        return this._totalMunicipioReceitaValor;
    } //-- double getTotalMunicipioReceitaValor() 

    /**
     * Returns the value of field 'totalMunicipioRecolherSinal'.
     * 
     * @return String
     * @return the value of field 'totalMunicipioRecolherSinal'.
     */
    public java.lang.String getTotalMunicipioRecolherSinal()
    {
        return this._totalMunicipioRecolherSinal;
    } //-- java.lang.String getTotalMunicipioRecolherSinal() 

    /**
     * Returns the value of field 'totalMunicipioRecolherValor'.
     * 
     * @return double
     * @return the value of field 'totalMunicipioRecolherValor'.
     */
    public double getTotalMunicipioRecolherValor()
    {
        return this._totalMunicipioRecolherValor;
    } //-- double getTotalMunicipioRecolherValor() 

    /**
     * Returns the value of field 'totalPaReceitaSinal'.
     * 
     * @return String
     * @return the value of field 'totalPaReceitaSinal'.
     */
    public java.lang.String getTotalPaReceitaSinal()
    {
        return this._totalPaReceitaSinal;
    } //-- java.lang.String getTotalPaReceitaSinal() 

    /**
     * Returns the value of field 'totalPaReceitaValor'.
     * 
     * @return double
     * @return the value of field 'totalPaReceitaValor'.
     */
    public double getTotalPaReceitaValor()
    {
        return this._totalPaReceitaValor;
    } //-- double getTotalPaReceitaValor() 

    /**
     * Returns the value of field 'totalPaRecolherSinal'.
     * 
     * @return String
     * @return the value of field 'totalPaRecolherSinal'.
     */
    public java.lang.String getTotalPaRecolherSinal()
    {
        return this._totalPaRecolherSinal;
    } //-- java.lang.String getTotalPaRecolherSinal() 

    /**
     * Returns the value of field 'totalPaRecolherValor'.
     * 
     * @return double
     * @return the value of field 'totalPaRecolherValor'.
     */
    public double getTotalPaRecolherValor()
    {
        return this._totalPaRecolherValor;
    } //-- double getTotalPaRecolherValor() 

    /**
     * Method hasNumeroConsultas
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroConsultas()
    {
        return this._has_numeroConsultas;
    } //-- boolean hasNumeroConsultas() 

    /**
     * Method hasQtdeAgencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeAgencia()
    {
        return this._has_qtdeAgencia;
    } //-- boolean hasQtdeAgencia() 

    /**
     * Method hasQtdePa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdePa()
    {
        return this._has_qtdePa;
    } //-- boolean hasQtdePa() 

    /**
     * Method hasTotalAgenciaReceitaValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalAgenciaReceitaValor()
    {
        return this._has_totalAgenciaReceitaValor;
    } //-- boolean hasTotalAgenciaReceitaValor() 

    /**
     * Method hasTotalAgenciaRecolherValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalAgenciaRecolherValor()
    {
        return this._has_totalAgenciaRecolherValor;
    } //-- boolean hasTotalAgenciaRecolherValor() 

    /**
     * Method hasTotalGeralReceitaValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalGeralReceitaValor()
    {
        return this._has_totalGeralReceitaValor;
    } //-- boolean hasTotalGeralReceitaValor() 

    /**
     * Method hasTotalGeralRecolherValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalGeralRecolherValor()
    {
        return this._has_totalGeralRecolherValor;
    } //-- boolean hasTotalGeralRecolherValor() 

    /**
     * Method hasTotalMunicipioReceitaValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalMunicipioReceitaValor()
    {
        return this._has_totalMunicipioReceitaValor;
    } //-- boolean hasTotalMunicipioReceitaValor() 

    /**
     * Method hasTotalMunicipioRecolherValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalMunicipioRecolherValor()
    {
        return this._has_totalMunicipioRecolherValor;
    } //-- boolean hasTotalMunicipioRecolherValor() 

    /**
     * Method hasTotalPaReceitaValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalPaReceitaValor()
    {
        return this._has_totalPaReceitaValor;
    } //-- boolean hasTotalPaReceitaValor() 

    /**
     * Method hasTotalPaRecolherValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTotalPaRecolherValor()
    {
        return this._has_totalPaRecolherValor;
    } //-- boolean hasTotalPaRecolherValor() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Method removeAllOcorDependenciaApuracaoMensal
     * 
     */
    public void removeAllOcorDependenciaApuracaoMensal()
    {
        _ocorDependenciaApuracaoMensalList.removeAllElements();
    } //-- void removeAllOcorDependenciaApuracaoMensal() 

    /**
     * Method removeOcorDependenciaApuracaoMensal
     * 
     * 
     * 
     * @param index
     * @return OcorDependenciaApuracaoMensal
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal removeOcorDependenciaApuracaoMensal(int index)
    {
        java.lang.Object obj = _ocorDependenciaApuracaoMensalList.elementAt(index);
        _ocorDependenciaApuracaoMensalList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal removeOcorDependenciaApuracaoMensal(int) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'numeroConsultas'.
     * 
     * @param numeroConsultas the value of field 'numeroConsultas'.
     */
    public void setNumeroConsultas(int numeroConsultas)
    {
        this._numeroConsultas = numeroConsultas;
        this._has_numeroConsultas = true;
    } //-- void setNumeroConsultas(int) 

    /**
     * Method setOcorDependenciaApuracaoMensal
     * 
     * 
     * 
     * @param index
     * @param vOcorDependenciaApuracaoMensal
     */
    public void setOcorDependenciaApuracaoMensal(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal vOcorDependenciaApuracaoMensal)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorDependenciaApuracaoMensalList.size())) {
            throw new IndexOutOfBoundsException("setOcorDependenciaApuracaoMensal: Index value '"+index+"' not in range [0.." + (_ocorDependenciaApuracaoMensalList.size() - 1) + "]");
        }
        _ocorDependenciaApuracaoMensalList.setElementAt(vOcorDependenciaApuracaoMensal, index);
    } //-- void setOcorDependenciaApuracaoMensal(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal) 

    /**
     * Method setOcorDependenciaApuracaoMensal
     * 
     * 
     * 
     * @param ocorDependenciaApuracaoMensalArray
     */
    public void setOcorDependenciaApuracaoMensal(br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal[] ocorDependenciaApuracaoMensalArray)
    {
        //-- copy array
        _ocorDependenciaApuracaoMensalList.removeAllElements();
        for (int i = 0; i < ocorDependenciaApuracaoMensalArray.length; i++) {
            _ocorDependenciaApuracaoMensalList.addElement(ocorDependenciaApuracaoMensalArray[i]);
        }
    } //-- void setOcorDependenciaApuracaoMensal(br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.OcorDependenciaApuracaoMensal) 

    /**
     * Sets the value of field 'qtdeAgencia'.
     * 
     * @param qtdeAgencia the value of field 'qtdeAgencia'.
     */
    public void setQtdeAgencia(long qtdeAgencia)
    {
        this._qtdeAgencia = qtdeAgencia;
        this._has_qtdeAgencia = true;
    } //-- void setQtdeAgencia(long) 

    /**
     * Sets the value of field 'qtdePa'.
     * 
     * @param qtdePa the value of field 'qtdePa'.
     */
    public void setQtdePa(long qtdePa)
    {
        this._qtdePa = qtdePa;
        this._has_qtdePa = true;
    } //-- void setQtdePa(long) 

    /**
     * Sets the value of field 'totalAgenciaReceitaSinal'.
     * 
     * @param totalAgenciaReceitaSinal the value of field
     * 'totalAgenciaReceitaSinal'.
     */
    public void setTotalAgenciaReceitaSinal(java.lang.String totalAgenciaReceitaSinal)
    {
        this._totalAgenciaReceitaSinal = totalAgenciaReceitaSinal;
    } //-- void setTotalAgenciaReceitaSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalAgenciaReceitaValor'.
     * 
     * @param totalAgenciaReceitaValor the value of field
     * 'totalAgenciaReceitaValor'.
     */
    public void setTotalAgenciaReceitaValor(double totalAgenciaReceitaValor)
    {
        this._totalAgenciaReceitaValor = totalAgenciaReceitaValor;
        this._has_totalAgenciaReceitaValor = true;
    } //-- void setTotalAgenciaReceitaValor(double) 

    /**
     * Sets the value of field 'totalAgenciaRecolherSinal'.
     * 
     * @param totalAgenciaRecolherSinal the value of field
     * 'totalAgenciaRecolherSinal'.
     */
    public void setTotalAgenciaRecolherSinal(java.lang.String totalAgenciaRecolherSinal)
    {
        this._totalAgenciaRecolherSinal = totalAgenciaRecolherSinal;
    } //-- void setTotalAgenciaRecolherSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalAgenciaRecolherValor'.
     * 
     * @param totalAgenciaRecolherValor the value of field
     * 'totalAgenciaRecolherValor'.
     */
    public void setTotalAgenciaRecolherValor(double totalAgenciaRecolherValor)
    {
        this._totalAgenciaRecolherValor = totalAgenciaRecolherValor;
        this._has_totalAgenciaRecolherValor = true;
    } //-- void setTotalAgenciaRecolherValor(double) 

    /**
     * Sets the value of field 'totalGeralReceitaSinal'.
     * 
     * @param totalGeralReceitaSinal the value of field
     * 'totalGeralReceitaSinal'.
     */
    public void setTotalGeralReceitaSinal(java.lang.String totalGeralReceitaSinal)
    {
        this._totalGeralReceitaSinal = totalGeralReceitaSinal;
    } //-- void setTotalGeralReceitaSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalGeralReceitaValor'.
     * 
     * @param totalGeralReceitaValor the value of field
     * 'totalGeralReceitaValor'.
     */
    public void setTotalGeralReceitaValor(double totalGeralReceitaValor)
    {
        this._totalGeralReceitaValor = totalGeralReceitaValor;
        this._has_totalGeralReceitaValor = true;
    } //-- void setTotalGeralReceitaValor(double) 

    /**
     * Sets the value of field 'totalGeralRecolherSinal'.
     * 
     * @param totalGeralRecolherSinal the value of field
     * 'totalGeralRecolherSinal'.
     */
    public void setTotalGeralRecolherSinal(java.lang.String totalGeralRecolherSinal)
    {
        this._totalGeralRecolherSinal = totalGeralRecolherSinal;
    } //-- void setTotalGeralRecolherSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalGeralRecolherValor'.
     * 
     * @param totalGeralRecolherValor the value of field
     * 'totalGeralRecolherValor'.
     */
    public void setTotalGeralRecolherValor(double totalGeralRecolherValor)
    {
        this._totalGeralRecolherValor = totalGeralRecolherValor;
        this._has_totalGeralRecolherValor = true;
    } //-- void setTotalGeralRecolherValor(double) 

    /**
     * Sets the value of field 'totalMunicipioReceitaSinal'.
     * 
     * @param totalMunicipioReceitaSinal the value of field
     * 'totalMunicipioReceitaSinal'.
     */
    public void setTotalMunicipioReceitaSinal(java.lang.String totalMunicipioReceitaSinal)
    {
        this._totalMunicipioReceitaSinal = totalMunicipioReceitaSinal;
    } //-- void setTotalMunicipioReceitaSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalMunicipioReceitaValor'.
     * 
     * @param totalMunicipioReceitaValor the value of field
     * 'totalMunicipioReceitaValor'.
     */
    public void setTotalMunicipioReceitaValor(double totalMunicipioReceitaValor)
    {
        this._totalMunicipioReceitaValor = totalMunicipioReceitaValor;
        this._has_totalMunicipioReceitaValor = true;
    } //-- void setTotalMunicipioReceitaValor(double) 

    /**
     * Sets the value of field 'totalMunicipioRecolherSinal'.
     * 
     * @param totalMunicipioRecolherSinal the value of field
     * 'totalMunicipioRecolherSinal'.
     */
    public void setTotalMunicipioRecolherSinal(java.lang.String totalMunicipioRecolherSinal)
    {
        this._totalMunicipioRecolherSinal = totalMunicipioRecolherSinal;
    } //-- void setTotalMunicipioRecolherSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalMunicipioRecolherValor'.
     * 
     * @param totalMunicipioRecolherValor the value of field
     * 'totalMunicipioRecolherValor'.
     */
    public void setTotalMunicipioRecolherValor(double totalMunicipioRecolherValor)
    {
        this._totalMunicipioRecolherValor = totalMunicipioRecolherValor;
        this._has_totalMunicipioRecolherValor = true;
    } //-- void setTotalMunicipioRecolherValor(double) 

    /**
     * Sets the value of field 'totalPaReceitaSinal'.
     * 
     * @param totalPaReceitaSinal the value of field
     * 'totalPaReceitaSinal'.
     */
    public void setTotalPaReceitaSinal(java.lang.String totalPaReceitaSinal)
    {
        this._totalPaReceitaSinal = totalPaReceitaSinal;
    } //-- void setTotalPaReceitaSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalPaReceitaValor'.
     * 
     * @param totalPaReceitaValor the value of field
     * 'totalPaReceitaValor'.
     */
    public void setTotalPaReceitaValor(double totalPaReceitaValor)
    {
        this._totalPaReceitaValor = totalPaReceitaValor;
        this._has_totalPaReceitaValor = true;
    } //-- void setTotalPaReceitaValor(double) 

    /**
     * Sets the value of field 'totalPaRecolherSinal'.
     * 
     * @param totalPaRecolherSinal the value of field
     * 'totalPaRecolherSinal'.
     */
    public void setTotalPaRecolherSinal(java.lang.String totalPaRecolherSinal)
    {
        this._totalPaRecolherSinal = totalPaRecolherSinal;
    } //-- void setTotalPaRecolherSinal(java.lang.String) 

    /**
     * Sets the value of field 'totalPaRecolherValor'.
     * 
     * @param totalPaRecolherValor the value of field
     * 'totalPaRecolherValor'.
     */
    public void setTotalPaRecolherValor(double totalPaRecolherValor)
    {
        this._totalPaRecolherValor = totalPaRecolherValor;
        this._has_totalPaRecolherValor = true;
    } //-- void setTotalPaRecolherValor(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarDependenciaApuracaoMensalResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.ListarDependenciaApuracaoMensalResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.ListarDependenciaApuracaoMensalResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.ListarDependenciaApuracaoMensalResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.response.ListarDependenciaApuracaoMensalResponse unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
