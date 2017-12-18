package mupi.com.mortgageproject.loan;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Solicitud implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("codigoProducto")
   private Integer codigoProducto;

   private java.lang.String grupoTipoCredito;

   private java.lang.String tipoGarantia;

   private java.lang.String tipoCliente;

   private java.lang.Double montoSolicitado;

   private java.lang.String tipoPersona;

   private java.lang.String requiereGarantias;

   private java.lang.String requiereGarantes;

   public Solicitud()
   {
   }

   public java.lang.String getGrupoTipoCredito()
   {
      return this.grupoTipoCredito;
   }

   public void setGrupoTipoCredito(java.lang.String grupoTipoCredito)
   {
      this.grupoTipoCredito = grupoTipoCredito;
   }

   public java.lang.String getTipoGarantia()
   {
      return this.tipoGarantia;
   }

   public void setTipoGarantia(java.lang.String tipoGarantia)
   {
      this.tipoGarantia = tipoGarantia;
   }

   public java.lang.String getTipoCliente()
   {
      return this.tipoCliente;
   }

   public void setTipoCliente(java.lang.String tipoCliente)
   {
      this.tipoCliente = tipoCliente;
   }

   public java.lang.Double getMontoSolicitado()
   {
      return this.montoSolicitado;
   }

   public void setMontoSolicitado(java.lang.Double montoSolicitado)
   {
      this.montoSolicitado = montoSolicitado;
   }

   public java.lang.String getTipoPersona()
   {
      return this.tipoPersona;
   }

   public void setTipoPersona(java.lang.String tipoPersona)
   {
      this.tipoPersona = tipoPersona;
   }

   public java.lang.String getRequiereGarantias()
   {
      return this.requiereGarantias;
   }

   public void setRequiereGarantias(java.lang.String requiereGarantias)
   {
      this.requiereGarantias = requiereGarantias;
   }

   public java.lang.String getRequiereGarantes()
   {
      return this.requiereGarantes;
   }

   public void setRequiereGarantes(java.lang.String requiereGarantes)
   {
      this.requiereGarantes = requiereGarantes;
   }

   public java.lang.Integer getCodigoProducto()
   {
      return this.codigoProducto;
   }

   public void setCodigoProducto(java.lang.Integer codigoProducto)
   {
      this.codigoProducto = codigoProducto;
   }

   public Solicitud(java.lang.Integer codigoProducto,
         java.lang.String grupoTipoCredito, java.lang.String tipoGarantia,
         java.lang.String tipoCliente, java.lang.Double montoSolicitado,
         java.lang.String tipoPersona, java.lang.String requiereGarantias,
         java.lang.String requiereGarantes)
   {
      this.codigoProducto = codigoProducto;
      this.grupoTipoCredito = grupoTipoCredito;
      this.tipoGarantia = tipoGarantia;
      this.tipoCliente = tipoCliente;
      this.montoSolicitado = montoSolicitado;
      this.tipoPersona = tipoPersona;
      this.requiereGarantias = requiereGarantias;
      this.requiereGarantes = requiereGarantes;
   }

}